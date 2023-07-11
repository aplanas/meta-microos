SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "A module to convert text with ANSI color codes to HTML or to LaTeX."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "python311-ansi2html-1.8.0-2.3.noarch.rpm"
RPM_HASH = "65ca4fed189f639cf3d64b9d83863a427209b89482d2d29700d2fffc728e40480deb3f821d4a52757eacae5eb59f61cc8b220ad0f2859d4eb7374c3a1cd2de04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansi2html \
python3.11dist-ansi2html \
python311-ansi2html \
python3dist-ansi2html"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
update-alternatives"

inherit rpm
