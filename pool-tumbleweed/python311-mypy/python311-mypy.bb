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

PV = "1.5.0"

RPM_NAME = "python311-mypy-1.5.0-1.1.noarch.rpm"
RPM_HASH = "f6dd7df4caaa482b4611e11c919b085ea7040a0c2becd61fb56f95ed5df3cdea1b85b2827a2011cdec5d0a1e4adf635d235ab75cfbca2b83271ba950abe9c0a3"
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
