SUMMARY = "ONNX Converter and Optimization Tools"
DESCRIPTION = "The onnxconverter-common package provides common functions and utilities for \
use in converters from various AI frameworks to ONNX. It also enables the \
different converters to work together to convert a model from mixed frameworks, \
like a scikit-learn pipeline embedding a xgboost model."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python39-onnxconverter-common-1.9.0-2.5.noarch.rpm"
RPM_HASH = "b8dcba5aaa8dedc06897e9d3c2ac3a3dcb167fb643943ad37878e811c178e193a774da38f76b7e60085b7bdeabaf85eee2a1adc22fee5bb30e7670992265ee13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(onnxconverter-common) \
python39-onnxconverter-common \
python3dist(onnxconverter-common)"

RDEPENDS:${PN} += "python(abi) \
python39-numpy \
python39-onnx \
python39-protobuf"

inherit rpm
