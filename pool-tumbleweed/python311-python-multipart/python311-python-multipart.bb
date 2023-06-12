SUMMARY = "Python streaming multipart parser"
DESCRIPTION = "A streaming multipart parser for Python."
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python311-python-multipart-0.0.5-5.3.noarch.rpm"
RPM_HASH = "aad57ab0282775f5c075cbe70150110853918786360d499987f627cf5bccae6d1c197fdf9f290c6513a5c95290289aaba31bb149fa7b689187feb96e58969238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-multipart) \
python311-python-multipart \
python3dist(python-multipart)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
