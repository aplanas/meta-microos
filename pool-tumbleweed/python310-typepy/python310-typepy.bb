SUMMARY = "Python library for run time variable type checker"
DESCRIPTION = "typepy is a Python library for variable type checker/validator/converter at run time."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-typepy-1.3.0-2.8.noarch.rpm"
RPM_HASH = "8582014fcd669672dd6eb769f5c4ffc91d090f3c249819c60d6183c3e192c856e8150f72685a65ea4b61c85842bcacedf3cb0349bb93e994cc03fe8eb0d4841c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typepy \
python3.10dist-typepy \
python310-typepy \
python3dist-typepy"

RDEPENDS:${PN} += "python-abi \
python310-mbstrdecoder"

inherit rpm
