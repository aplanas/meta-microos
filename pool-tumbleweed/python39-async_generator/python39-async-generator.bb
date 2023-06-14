SUMMARY = "Async generators and context managers for Python 3.5+"
DESCRIPTION = "Python 3.6 added async generators. Python 3.7 adds some more \
tools to make them usable, like contextlib.asynccontextmanager."
LICENSE = "Apache-2.0 | MIT"

PV = "1.10"

RPM_NAME = "python39-async_generator-1.10-3.1.noarch.rpm"
RPM_HASH = "01d66b3afc382ad196a12c3b3171b07cb303ca559dc096e191e41eebfc49ec0445e9eaf5dd5efdc9f69b11cb81f6f726795b5df4833e3525b79c9bfba41fb071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-async-generator \
python39-async-generator \
python3dist-async-generator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
