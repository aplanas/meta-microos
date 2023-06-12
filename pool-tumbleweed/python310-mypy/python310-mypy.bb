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

RPM_NAME = "python310-mypy-1.3.0-1.1.noarch.rpm"
RPM_HASH = "5d777d03afa460e07f35f0852e88791bf8059815d0304c0395d849d07b60c9548d2a87e3b8b86c3db5025159e472e136f0a1bf9b4cd2cb01886a962d46c81a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypy \
python3-mypy \
python3.10dist(mypy) \
python310-mypy \
python3dist(mypy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-mypy_extensions \
python310-tomli \
python310-typing_extensions \
update-alternatives"

inherit rpm
