SUMMARY = "Async generators and context managers for Python 3.5+"
DESCRIPTION = "Python 3.6 added async generators. Python 3.7 adds some more \
tools to make them usable, like contextlib.asynccontextmanager."
LICENSE = "Apache-2.0 | MIT"

PV = "1.10"

RPM_NAME = "python310-async_generator-1.10-3.3.noarch.rpm"
RPM_HASH = "a891735a39ebb467d19e485635254be7238716248f3dc36858a4f673d794ae7532ecd5d881d3051a2097f5d5474f227d23ee1f4384ddd2e3a60aa4b25c44bf05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-async-generator \
python310-async-generator \
python3dist-async-generator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
