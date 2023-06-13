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

RPM_NAME = "python310-nest-asyncio-1.5.6-1.3.noarch.rpm"
RPM_HASH = "a85b0811ac8743df42e0c07f8aa373872e3b34c737be2a0a0d5c1fb2fdab7d0c1689339930e1fe2135b8b73817a83a642c75552de791a9d6f0645fbdef20edb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nest-asyncio \
python3.10dist(nest-asyncio) \
python310-nest-asyncio \
python3dist(nest-asyncio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
