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

PV = "1.4.1"

RPM_NAME = "python39-mypy-1.4.1-1.1.noarch.rpm"
RPM_HASH = "5e3470ef3b4fe60158a1f911aa00aabf0ec43e44fa60846ee77f0d2b27241df06054e5be4c2ab23fc83c634f0680f0feccc1a763b388534992ff57d53cf79031"
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
