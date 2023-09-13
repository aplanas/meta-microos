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

RPM_NAME = "python310-mypy-1.5.1-1.1.noarch.rpm"
RPM_HASH = "b6d209f83cdb484a7b774034d058a4119e6afc424366dcff071577714cb61ad810a8cf49ef4c5b5d0ef3f3a24b3c34971357eda660b61b6737a0ed1cf7c74fad"
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
