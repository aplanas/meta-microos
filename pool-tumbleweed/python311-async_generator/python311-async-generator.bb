SUMMARY = "Async generators and context managers for Python 3.5+"
DESCRIPTION = "Python 3.6 added async generators. Python 3.7 adds some more \
tools to make them usable, like contextlib.asynccontextmanager."
LICENSE = "Apache-2.0 | MIT"

PV = "1.10"

RPM_NAME = "python311-async_generator-1.10-3.3.noarch.rpm"
RPM_HASH = "6544116d171ab59cbfb037ca27564951ab09b3f2eeec90a83c705b81db79648fefff98c747bc1f448a4d760c1077894e0fb273c7f48b065eb287c98884997202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-generator \
python3.11dist-async-generator \
python311-async-generator \
python3dist-async-generator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
