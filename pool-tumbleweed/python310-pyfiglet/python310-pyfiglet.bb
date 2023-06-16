SUMMARY = "Pure Python FIGlet implementation"
DESCRIPTION = "PyFIGlet is a full port of FIGlet (http://www.figlet.org/) into pure \
Python. It takes ASCII text and renders it in ASCII art fonts."
LICENSE = "MIT"

PV = "0.8.post1"

RPM_NAME = "python310-pyfiglet-0.8.post1-2.13.noarch.rpm"
RPM_HASH = "3b49259b6735ca10521156276bdbad9e6164ef87604ad7b9e642ed543796a56c70eab05e2b49da2384778a676c243573c90855ef99ed8f34326a949a3e6291be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfiglet \
python3.10dist-pyfiglet \
python310-pyfiglet \
python3dist-pyfiglet"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
