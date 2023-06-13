SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-serial-22.10.0-6.1.noarch.rpm"
RPM_HASH = "9ba15d43165989433e2cae60eead87bbeeb0858ccc8974e8202cb2e9b157f5bbb962a06cf33ab75645ef36411db96793b11915dcc6314ca71267c287e02a7ec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-serial \
python310-Twisted-serial"

RDEPENDS:${PN} += "python310-Twisted \
python310-pyserial"

inherit rpm
