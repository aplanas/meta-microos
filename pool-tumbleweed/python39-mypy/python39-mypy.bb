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

RPM_NAME = "python39-mypy-1.5.0-1.1.noarch.rpm"
RPM_HASH = "03298a6da840e73b42dca16b9bcd237813390b87a9bf80b32d5a86dd610ec6505410b16068b1917615565650391858e68da37c17e142f28a25446b8b9349e88f"
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
