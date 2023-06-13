SUMMARY = "Python 2/3 unicode CSV compatibility layer"
DESCRIPTION = "Python 2/3 unicode CSV compatibility layer"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-csv23-0.3.4-2.1.noarch.rpm"
RPM_HASH = "3f943e776abc53ef7532549170f30f3f31415966925174c24a8e0bb694468b5c66c02d311401f6c71f687da2c462ee4b35cf444eff52236732f9040b932faf4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(csv23) \
python311-csv23 \
python3dist(csv23)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
