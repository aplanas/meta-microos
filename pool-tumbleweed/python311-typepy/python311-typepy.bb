SUMMARY = "Python library for run time variable type checker"
DESCRIPTION = "typepy is a Python library for variable type checker/validator/converter at run time."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-typepy-1.3.0-2.10.noarch.rpm"
RPM_HASH = "5479e4d6e1f321ac7d6ca417531cb8cf77f9deb8aa21655a7c9068a50279012820c14ab0d3868c4e69b0a99a76885a44ec09f5f3b36e275b25e5c099226e2588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typepy \
python3.11dist-typepy \
python311-typepy \
python3dist-typepy"

RDEPENDS:${PN} += "python-abi \
python311-mbstrdecoder"

inherit rpm
