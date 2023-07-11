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

RPM_NAME = "python311-pyproject-hooks-1.0.0-2.3.noarch.rpm"
RPM_HASH = "dace612e92dd2559f321f8c66cfe9989bf47ebb0abeace0e1970ad8b6898bfa21047d40bce113f4c8e81cff42d14f4e141df0ce40d789e0056bd7dea8b4aa959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-hooks \
python3.11dist-pyproject-hooks \
python311-pyproject-hooks \
python3dist-pyproject-hooks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
