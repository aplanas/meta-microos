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

RPM_NAME = "python39-nest-asyncio-1.5.6-1.3.noarch.rpm"
RPM_HASH = "61384cfdb5e66d8cd85077d13b9df9e7cdc9b0c4976410b52aa0cc4f6066d7b0aa61fc67e1b1da1cabc67583d5d9ea21d5a354d500fadbd2cf9a99f5977c395e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nest-asyncio) \
python39-nest-asyncio \
python3dist(nest-asyncio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
