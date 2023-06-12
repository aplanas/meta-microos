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

RPM_NAME = "python311-pyproject-hooks-1.0.0-2.1.noarch.rpm"
RPM_HASH = "5b3202c82f4cc092e9b5e2d04ba84504e74662ae26f36aa254416266226929a29a298007722a6cdac85e4ff9bd75a939e0cf6b9d9db59749ddedc3513f5606df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyproject-hooks) \
python311-pyproject-hooks \
python3dist(pyproject-hooks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
