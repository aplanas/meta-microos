SUMMARY = "Python 2/3 unicode CSV compatibility layer"
DESCRIPTION = "Python 2/3 unicode CSV compatibility layer"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-csv23-0.3.4-2.3.noarch.rpm"
RPM_HASH = "58b8b9a9006b355a439d08b948cfa3aec82f83f1eb1b54890e193820097d296d7e144799a73a6f332117d421b6c325a810805b9d4e0a7fa41eda4c7e750abffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-csv23 \
python3.11dist-csv23 \
python311-csv23 \
python3dist-csv23"

RDEPENDS:${PN} += "python-abi"

inherit rpm
