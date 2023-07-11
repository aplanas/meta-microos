SUMMARY = "ONNX Converter and Optimization Tools"
DESCRIPTION = "The onnxconverter-common package provides common functions and utilities for \
use in converters from various AI frameworks to ONNX. It also enables the \
different converters to work together to convert a model from mixed frameworks, \
like a scikit-learn pipeline embedding a xgboost model."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python310-onnxconverter-common-1.9.0-2.7.noarch.rpm"
RPM_HASH = "9a516ee98b2e83b629af1062f3710b15c6e677036a60e8169b274b84411a54c4a914409d1b3a2a8ff7fa414e8070cac303fabad90db649939c8821001c3a050c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-onnxconverter-common \
python310-onnxconverter-common \
python3dist-onnxconverter-common"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-onnx \
python310-protobuf"

inherit rpm
