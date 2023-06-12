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

PV = "1.3.0"

RPM_NAME = "python311-mypy-1.3.0-1.1.noarch.rpm"
RPM_HASH = "4238d0a166bb1e7f90047c36218e5ea993be6370b36858b0d43636553879f0ed1051888f56ea9c49de77266b9a5928bec0d32a02f017c51a9944ab15ba5efa05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mypy) \
python311-mypy \
python3dist(mypy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-mypy_extensions \
python311-typing_extensions \
update-alternatives"

inherit rpm
