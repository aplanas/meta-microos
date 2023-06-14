SUMMARY = "ONNX Converter and Optimization Tools"
DESCRIPTION = "The onnxconverter-common package provides common functions and utilities for \
use in converters from various AI frameworks to ONNX. It also enables the \
different converters to work together to convert a model from mixed frameworks, \
like a scikit-learn pipeline embedding a xgboost model."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python310-onnxconverter-common-1.9.0-2.5.noarch.rpm"
RPM_HASH = "c9d2fa854f26afab7469064431d723aa52bb4b09c2231b42139a9eea89cddbc5bc26094028a5c9362ae08012554b01157e1ac9e8d794eb9e6e54ae38b52fec3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-onnxconverter-common \
python3.10dist-onnxconverter-common \
python310-onnxconverter-common \
python3dist-onnxconverter-common"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-onnx \
python310-protobuf"

inherit rpm
