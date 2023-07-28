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

RPM_NAME = "python310-mypy-1.4.1-1.1.noarch.rpm"
RPM_HASH = "7b204b6d1227ffbe2b572fe892090c18948bd77167452e435911c489ac780898f11e8b46360aabf4bc0d8a668b105442dc43846fbf3c3f2c5c7b3126d424cb5e"
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
