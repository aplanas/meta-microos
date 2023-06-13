SUMMARY = "Generate and change color-schemes on the fly"
DESCRIPTION = "Generate and change color-schemes on the fly"
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-pywal-3.3.0-1.13.noarch.rpm"
RPM_HASH = "4954a870dcce4a690e0e7ef1ede6de98b24ce0b5f9fad20ca5d73e967e29b7e0a5acc020bb58bfb119b823934d954bd66140b7d9b38196cef18006470e8ad5eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pywal) \
python311-pywal \
python3dist(pywal)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi)"

inherit rpm
