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

RPM_NAME = "python310-mypy-1.4.0-1.1.noarch.rpm"
RPM_HASH = "85d9041088b4fc28ec4dc3eff8d930addc8d3b5dec874fb148050d95b395477286eb9b5a8e18cd6cd4d67921fe09dc5e3ad2fe65c488957818f064976c050c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mypy \
python310-mypy \
python3dist-mypy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-mypy-extensions \
python310-typing-extensions \
update-alternatives"

inherit rpm
