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

RPM_NAME = "python311-mypy-1.4.1-1.1.noarch.rpm"
RPM_HASH = "0915523c15bb3b0822bfe092677f7eba94fcbc8708c60ae19fad830f868a487f5e98ff55b06059b9a842b1f0f2407d9fa292968cda9062652145a4fda0988273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypy \
python3-mypy \
python3.11dist-mypy \
python311-mypy \
python3dist-mypy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-mypy-extensions \
python311-typing-extensions \
update-alternatives"

inherit rpm
