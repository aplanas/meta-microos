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

RPM_NAME = "python39-pyproject-hooks-1.0.0-2.3.noarch.rpm"
RPM_HASH = "62fcb355394614eba854015c23e14036289759dad475c67bc941a92e7f885de2d9d1f5c8293f13470abdf77e6c800e9738900d5bd04e403ae5e1477cbf1854ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyproject-hooks \
python39-pyproject-hooks \
python3dist-pyproject-hooks"

RDEPENDS:${PN} += "python-abi \
python39-tomli"

inherit rpm
