SUMMARY = "A tool for integrating Git with Patchwork"
DESCRIPTION = "git-pw is a tool for integrating Git with Patchwork, the web-based patch \
tracking system."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-git-pw-2.4.0-2.4.noarch.rpm"
RPM_HASH = "09cde45fbd887862fa55fbbb9e2a6d14a348a4d1b4de935f245cd31b6db03a6134ac5f79132ab962411b993eba7d53fd0527f100e011dc72f49db6d31a5c3bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-pw \
python3.9dist-git-pw \
python39-git-pw \
python3dist-git-pw"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
git-core \
python-abi \
python39-arrow \
python39-click \
python39-pyaml \
python39-requests \
python39-tabulate \
update-alternatives"

inherit rpm
