SUMMARY = "Wrappers to call pyproject.toml-based build backend hooks"
DESCRIPTION = "This is a low-level library for calling build-backends in ``pyproject.toml``-based project. \
It provides the basic functionality to help write tooling that generates distribution files from Python projects. \
 \
If you want a tool that builds Python packages, you'll want to use https://github.com/pypa/build instead. \
This is an underlying piece for `pip`, `build` and other 'build frontends' use to call 'build backends' within them. \
 \
Note: The ``pep517`` project has been replaced by this project (low level) and the ``build`` project (high level)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pyproject-hooks-1.0.0-2.1.noarch.rpm"
RPM_HASH = "57cbda4bb139e2457272bcb2b5e01fb4fe46964cb4c5e98718e8af0868229b838a094be2aeded18c71de397a80522347db9a505fed4df71646e8dd5cf491ee4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-hooks \
python3.10dist-pyproject-hooks \
python310-pyproject-hooks \
python3dist-pyproject-hooks"

RDEPENDS:${PN} += "python-abi \
python310-tomli"

inherit rpm
