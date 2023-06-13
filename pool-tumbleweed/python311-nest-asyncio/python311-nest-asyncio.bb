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

RPM_NAME = "python311-nest-asyncio-1.5.6-1.3.noarch.rpm"
RPM_HASH = "ced88a9136b5db4009a6ce78cb8f9cfb99d4773d9683e17fd8266d4bc473a5b6ab63fa5aecab3355e66f1689168ef990b7e812f108f9c4b00c46435253280f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nest-asyncio) \
python311-nest-asyncio \
python3dist(nest-asyncio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
