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

RPM_NAME = "python310-mypy-1.5.0-1.1.noarch.rpm"
RPM_HASH = "666b3612c955ad6ec54fad647c1f885b5ed1c7c3d0ff0d75d454d8ce38d454aef6d3945df36980591fa9cc844986546f00ef7f467935d0128770bf3da2d14cb4"
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
