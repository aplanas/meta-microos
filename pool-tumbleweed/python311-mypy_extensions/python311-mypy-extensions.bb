SUMMARY = "Experimental type system extensions for programs checked with mypy typechecker"
DESCRIPTION = "The 'mypy_extensions' module defines experimental extensions to the \
standard 'typing' module that are supported by the mypy typechecker."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-mypy_extensions-1.0.0-1.2.noarch.rpm"
RPM_HASH = "a91c84980831d2d2bb567df48a5b36869cad07a3da3bc52bfbcaa33563d6ed3cc72fe5c1b967b10137bb788ea99e987388971654522426b77b7935cddc3bd435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mypy-extensions \
python3.11dist-mypy-extensions \
python311-mypy-extensions \
python3dist-mypy-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
