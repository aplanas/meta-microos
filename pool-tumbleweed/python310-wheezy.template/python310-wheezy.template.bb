SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-wheezy.template-3.1.0-1.2.noarch.rpm"
RPM_HASH = "3a9ecf3e8738dd977bad416863a1bd57d167bac93a82d2903ad286eb79fe0d21276356bed71e5a2c24c93158231f1ce4d1818cdedb91013d469517d566d64eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wheezy.template \
python310-wheezy.template \
python3dist-wheezy.template"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
