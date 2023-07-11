SUMMARY = "Focus animations for tiling window managers"
DESCRIPTION = "Focus animations for tiling window managers. Compatible with all X based window managers."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "flashfocus-2.3.1-1.3.noarch.rpm"
RPM_HASH = "6e2c1f429961a347646f53566e7bd29ed0243b788be309e38b3a1da5f26764c9ecb7da468bdcc60b803d02878411edab3e7bba53da96c4e41b017e7cc507b8d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flashfocus \
python3.11dist-flashfocus \
python3dist-flashfocus"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-cffi \
python3-click \
python3-marshmallow \
python3-xcffib \
python3-xpybutil"

inherit rpm
