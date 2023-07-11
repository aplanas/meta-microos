SUMMARY = "Optional static typing for Python"
DESCRIPTION = "Mypy is an optional static type checker for Python that aims to \
combine the benefits of both dynamic (or 'duck') typing as well as \
static typing. \
 \
Mypy type checks standard Python programs. It can catch many \
programming errors by analyzing programs without having to run them. \
There is basically no runtime overhead when run using any Python VM. \
Mypy's type system features type inference, gradual typing, generics \
and union types."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-mypy-1.4.0-1.1.noarch.rpm"
RPM_HASH = "4ea820e8fd69a4bfa6627c72644bf2184cafa9f37dc3e3520ce5d8f6c16b4e75b7d84d425c095fc265334416f7b575e48655cf308f1075f90313c50cf8099c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypy \
python3-mypy \
python3.11dist-mypy \
python311-mypy \
python3dist-mypy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-mypy-extensions \
python311-typing-extensions \
update-alternatives"

inherit rpm
