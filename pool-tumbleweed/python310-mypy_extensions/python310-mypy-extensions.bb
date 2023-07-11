SUMMARY = "Experimental type system extensions for programs checked with mypy typechecker"
DESCRIPTION = "The 'mypy_extensions' module defines experimental extensions to the \
standard 'typing' module that are supported by the mypy typechecker."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-mypy_extensions-1.0.0-1.2.noarch.rpm"
RPM_HASH = "b9fdf8438cca6ae351b15c3fe1672a243bd8b485b8fb4fd5cdbcea41d62d66fda6cc14cd15c8d2617c3e7a5be2d5b32651be94f7e5719b37ce2480a4a894ac6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mypy-extensions \
python310-mypy-extensions \
python3dist-mypy-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
