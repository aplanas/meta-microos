SUMMARY = "TVM command line driver"
DESCRIPTION = "TVMC is a tool that exposes TVM features such as auto-tuning, compiling, \
profiling and execution of models, via a command line interface."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "tvmc-0.11.0-2.6.aarch64.rpm"
RPM_HASH = "8423a4f09945eae45794345a5180beec0ca9fac92ba6d21e9b79478beb149deeb79d628c1afb1918f0f77bd9c26ce4d57effcf2ed60248f2433ff08d7ccac179"

RPROVIDES:${PN} += "tvmc \
tvmc(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
libtvm \
python3-scipy \
python3-setuptools \
python3-tvm \
python3-typed-ast"

inherit rpm
