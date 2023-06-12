SUMMARY = "ONNX Converter and Optimization Tools"
DESCRIPTION = "The onnxconverter-common package provides common functions and utilities for \
use in converters from various AI frameworks to ONNX. It also enables the \
different converters to work together to convert a model from mixed frameworks, \
like a scikit-learn pipeline embedding a xgboost model."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python311-onnxconverter-common-1.9.0-2.5.noarch.rpm"
RPM_HASH = "b41cec4d6c08d26f9437f04cea6e7265748552744e3ce61c959065f8f9909c60ed9b84add96016f53ba4b40e9b435b181f373f8c0e99d98176950698f2a1d390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(onnxconverter-common) \
python311-onnxconverter-common \
python3dist(onnxconverter-common)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-onnx \
python311-protobuf"

inherit rpm
