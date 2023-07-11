SUMMARY = "Patch asyncio to allow nested event loops"
DESCRIPTION = "By design asyncio `does not allow <https://bugs.python.org/issue22239>`_ \
its event loop to be nested. This presents a practical problem: \
When in an environment where the event loop is \
already running it's impossible to run tasks and wait \
for the result. Trying to do so will give the error \
'``RuntimeError: This event loop is already running``'. \
 \
The issue pops up in various environments, such as web servers, \
GUI applications and in Jupyter notebooks. \
 \
This module patches asyncio to allow nested use of ``asyncio.run`` and \
``loop.run_until_complete``."
LICENSE = "BSD-2-Clause"

PV = "1.5.6"

RPM_NAME = "python310-nest-asyncio-1.5.6-1.4.noarch.rpm"
RPM_HASH = "85b8d2e9c20f28a41b6a6b0428c99697337365739137b00f4de8dc38dce76a7d1fdfca38752971fc1bc72ae16e0d5077b419c7f6d310fb5336efa2153da7ea53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nest-asyncio \
python310-nest-asyncio \
python3dist-nest-asyncio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
