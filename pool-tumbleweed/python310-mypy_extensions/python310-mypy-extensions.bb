SUMMARY = "Experimental type system extensions for programs checked with mypy typechecker"
DESCRIPTION = "The 'mypy_extensions' module defines experimental extensions to the \
standard 'typing' module that are supported by the mypy typechecker."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-mypy_extensions-1.0.0-1.1.noarch.rpm"
RPM_HASH = "28f7d782568fadef6a14021540229b8156d341ee8283149b99530c97df2dfd682302991e1d7eda7693abd719b736f160536b9c80323f8d0c9ed520d404147d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mypy-extensions \
python3.10dist-mypy-extensions \
python310-mypy-extensions \
python3dist-mypy-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
