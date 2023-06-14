SUMMARY = "Async generators and context managers for Python 3.5+"
DESCRIPTION = "Python 3.6 added async generators. Python 3.7 adds some more \
tools to make them usable, like contextlib.asynccontextmanager."
LICENSE = "Apache-2.0 | MIT"

PV = "1.10"

RPM_NAME = "python310-async_generator-1.10-3.1.noarch.rpm"
RPM_HASH = "41debfe0df240be78f07a9f6f99dfcabcb2308c0acbf4769e65c65654a1353ee177cabf19035a12d7b1f96344bdab4dae49015cb7203a9bb404b91ca5625e0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-generator \
python3.10dist-async-generator \
python310-async-generator \
python3dist-async-generator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
