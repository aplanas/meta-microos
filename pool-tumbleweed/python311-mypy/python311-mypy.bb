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

RPM_NAME = "python311-mypy-1.5.1-1.1.noarch.rpm"
RPM_HASH = "bac4380375729ea8d30df9c2d8e5b780878e27a04e4446e2193ddd6dc0fb64df10278e6ee1430deb00c40d2447c1fd8fc626d5763bcc9bcbffdce6ef90d3e505"
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
