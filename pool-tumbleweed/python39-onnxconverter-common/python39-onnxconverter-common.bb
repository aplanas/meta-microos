SUMMARY = "ONNX Converter and Optimization Tools"
DESCRIPTION = "The onnxconverter-common package provides common functions and utilities for \
use in converters from various AI frameworks to ONNX. It also enables the \
different converters to work together to convert a model from mixed frameworks, \
like a scikit-learn pipeline embedding a xgboost model."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python39-onnxconverter-common-1.9.0-2.7.noarch.rpm"
RPM_HASH = "bf82bbeaf8bdba11ead010df10a7c26fca8dd122803446e21c7a74cc2cc3569c1bb3981680faac957b12ef9e8af0116fc88242e42dd36e4f8c78aaba553fa88e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-onnxconverter-common \
python39-onnxconverter-common \
python3dist-onnxconverter-common"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-onnx \
python39-protobuf"

inherit rpm
