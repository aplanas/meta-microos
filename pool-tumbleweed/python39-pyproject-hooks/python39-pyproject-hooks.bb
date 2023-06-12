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

RPM_NAME = "python39-pyproject-hooks-1.0.0-2.1.noarch.rpm"
RPM_HASH = "7a69f36246f19f0a3ea3b1c96b8d2e8f4a8bca6d75e73d8effd0e77af5102012d6f2439e42477d17c663750bd5a602588ec5d987fa24ccf792e6354acd2d9701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyproject-hooks) \
python39-pyproject-hooks \
python3dist(pyproject-hooks)"
RDEPENDS:${PN} += "python(abi) \
python39-tomli"

inherit rpm
