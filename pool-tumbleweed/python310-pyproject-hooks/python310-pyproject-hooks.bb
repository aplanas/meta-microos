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

RPM_NAME = "python310-pyproject-hooks-1.0.0-2.3.noarch.rpm"
RPM_HASH = "04e1ca22c2c25cfdfdc7b0eca61063f072b2532827d22bdeef87e32bbf9e443321844c9019878797f605eb3240657eb2e7b1d76a1118e01bc7d612cc15054444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyproject-hooks \
python310-pyproject-hooks \
python3dist-pyproject-hooks"

RDEPENDS:${PN} += "python-abi \
python310-tomli"

inherit rpm
