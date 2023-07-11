SUMMARY = "Python compatibility headers"
DESCRIPTION = "py3c helps porting C extensions to Python 3. \
 \
It provides a guide, and a set of macros to facilitate porting \
and reduce boilerplate."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python310-py3c-1.4-1.4.noarch.rpm"
RPM_HASH = "1a069f51ff04bc1a81d1eae11c6a2c932f36bbef8033d85a599a13ab20ca865801d24657c85fc1988a298c1a0c141f909f6598ae2ccc45fdd6faca1fd6de36b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py3c \
python310-py3c \
python3dist-py3c"

RDEPENDS:${PN} += ""

inherit rpm
