SUMMARY = "ONNX Converter and Optimization Tools"
DESCRIPTION = "The onnxconverter-common package provides common functions and utilities for \
use in converters from various AI frameworks to ONNX. It also enables the \
different converters to work together to convert a model from mixed frameworks, \
like a scikit-learn pipeline embedding a xgboost model."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python311-onnxconverter-common-1.9.0-2.7.noarch.rpm"
RPM_HASH = "8a206618b6318ec8b8288ae45cbc8455893471efe98871095c1fc19069999587c085a1bc79476e3b3a25e7a25f265db5983a83fb4e7f361648375abd3c6a4632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-onnxconverter-common \
python3.11dist-onnxconverter-common \
python311-onnxconverter-common \
python3dist-onnxconverter-common"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-onnx \
python311-protobuf"

inherit rpm
