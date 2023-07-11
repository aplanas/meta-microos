SUMMARY = "Async generators and context managers for Python 3.5+"
DESCRIPTION = "Python 3.6 added async generators. Python 3.7 adds some more \
tools to make them usable, like contextlib.asynccontextmanager."
LICENSE = "Apache-2.0 | MIT"

PV = "1.10"

RPM_NAME = "python39-async_generator-1.10-3.3.noarch.rpm"
RPM_HASH = "baa51671f8aefef102df1212ae80d52f68881e95193fb15fdc114da2698fe96dbf3a4728b05f99dc9dfa161169614b840be817c1e119380c1a0125b511c95897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-async-generator \
python39-async-generator \
python3dist-async-generator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
