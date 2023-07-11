SUMMARY = "TVM command line driver"
DESCRIPTION = "TVMC is a tool that exposes TVM features such as auto-tuning, compiling, \
profiling and execution of models, via a command line interface."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "tvmc-0.11.0-2.7.aarch64.rpm"
RPM_HASH = "f6528118d3fac7c93c493cd76b50defe99211c1bc9f750df508110d213ea2c478100a89c29d3850b764a7710741de48d86368e066852788cbeeef15c7ae93142"

RPROVIDES:${PN} += "tvmc"

RDEPENDS:${PN} += "/usr/bin/python3 \
libtvm \
python3-scipy \
python3-setuptools \
python3-tvm \
python3-typed-ast"

inherit rpm
