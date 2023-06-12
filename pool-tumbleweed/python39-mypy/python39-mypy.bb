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

RPM_NAME = "python39-mypy-1.3.0-1.1.noarch.rpm"
RPM_HASH = "3df1352b3a66b1a29a2f50928d09903e6c7b661b82a3db2d97fefa9e670b87b389ee0e465d3fd9d23d66b49d0ca37f0e35ff2714c5b0f1855e198aab49bdcb18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mypy) \
python39-mypy \
python3dist(mypy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-mypy_extensions \
python39-tomli \
python39-typing_extensions \
update-alternatives"

inherit rpm
