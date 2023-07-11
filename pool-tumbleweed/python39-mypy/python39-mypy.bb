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

RPM_NAME = "python39-mypy-1.4.0-1.1.noarch.rpm"
RPM_HASH = "59a34a36b2855b7cfe07a02b15564d558fe38210d3d20dbf4ea82508eff76294a396c4bb58b7c8b7348baf20a6d71b945cb5ff0bfb8e53da1f366095012a6a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mypy \
python39-mypy \
python3dist-mypy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-mypy-extensions \
python39-typing-extensions \
update-alternatives"

inherit rpm
