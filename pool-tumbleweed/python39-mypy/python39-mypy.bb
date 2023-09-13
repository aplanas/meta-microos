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

PV = "1.5.1"

RPM_NAME = "python39-mypy-1.5.1-1.1.noarch.rpm"
RPM_HASH = "f43b506451ad8c047e22eb5676a9de0d7f59d4cbc4435bb88bfffc0decd697989f65c1345c162214121bf8446ea3fbe2c5a6b06071bd8318457b3676111c6e6b"
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
