SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "python39-pass-git-helper-1.4.0-1.1.noarch.rpm"
RPM_HASH = "eb936ebecb54b3f11a8c14046d524295a8ee671ed09467f0ba131646626267f81857d1464ff80403c147b8c0198161881f0b51e31940c4dc0f719d9067558683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pass-git-helper \
python39-pass-git-helper \
python3dist-pass-git-helper"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pyxdg \
update-alternatives"

inherit rpm
