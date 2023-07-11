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

RPM_NAME = "python39-nest-asyncio-1.5.6-1.4.noarch.rpm"
RPM_HASH = "3cd3defa07ec3c17b5b9586315b79b02da1eb2d64aa55a7d4f333cac10d073905e56fe2b56f5c86cd7e5e1b5d37b759e3f9cbbc5728d5533519e5530b4e971d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nest-asyncio \
python39-nest-asyncio \
python3dist-nest-asyncio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
