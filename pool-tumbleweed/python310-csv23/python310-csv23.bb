SUMMARY = "Python 2/3 unicode CSV compatibility layer"
DESCRIPTION = "Python 2/3 unicode CSV compatibility layer"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-csv23-0.3.4-2.1.noarch.rpm"
RPM_HASH = "83961511d488c931d034ac89f0acc51a0904e8e2a8984136e4c577ea318345b3b47fe83615e3b3811b89d6ce77dac4169b17f6bde017a8a7cbaf98c2924b44bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-csv23 \
python3.10dist(csv23) \
python310-csv23 \
python3dist(csv23)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
