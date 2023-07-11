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

RPM_NAME = "python311-nest-asyncio-1.5.6-1.4.noarch.rpm"
RPM_HASH = "32a395fd80e08d3a0fade04fb05c884a4005c50bc66c60ac376e72932c9152f8d12b877e2815f60ca63261c1014a9c0f5045bca31d5008b49cebf2b4435a5864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nest-asyncio \
python3.11dist-nest-asyncio \
python311-nest-asyncio \
python3dist-nest-asyncio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
