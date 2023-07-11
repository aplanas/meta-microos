SUMMARY = "Experimental type system extensions for programs checked with mypy typechecker"
DESCRIPTION = "The 'mypy_extensions' module defines experimental extensions to the \
standard 'typing' module that are supported by the mypy typechecker."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-mypy_extensions-1.0.0-1.2.noarch.rpm"
RPM_HASH = "57f74f03c65aac8aeca22a764090fd0cd72948c1ce7238f22f1ff06e0b82d4837885869d5d323a8d5ca04185d74af91597da27eb8fd304925ab31af09354907a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mypy-extensions \
python39-mypy-extensions \
python3dist-mypy-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
