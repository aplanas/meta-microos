SUMMARY = "Python library for run time variable type checker"
DESCRIPTION = "typepy is a Python library for variable type checker/validator/converter at run time."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-typepy-1.3.0-2.10.noarch.rpm"
RPM_HASH = "f58df0d1d16e2eb3273f10d63cdf19313d83a48afb2d646b890d361ce0ad98bfc0c68aad29f7952664fc1ef356913ca2b729956dfdffa171dce7d520948ae50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-typepy \
python310-typepy \
python3dist-typepy"

RDEPENDS:${PN} += "python-abi \
python310-mbstrdecoder"

inherit rpm
