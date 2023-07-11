SUMMARY = "Library with cross-python path, ini-parsing, io, code, log facilities"
DESCRIPTION = "The py lib is a Python development support library featuring \
the following tools and modules: \
 \
* py.path:  uniform local and svn path objects \
* py.apipkg:  explicit API control and lazy-importing \
* py.iniconfig:  easy parsing of .ini files \
* py.code: dynamic code generation and introspection \
* py.path:  uniform local and svn path objects"
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python310-py-1.11.0-4.2.noarch.rpm"
RPM_HASH = "edff048b737e45f257bc43cc00a58f810e7ee036b5ba8b3bc26eb6642ce2e8d7586f4c1a020579847409ab3d9eac1d2a12294ce4e757d1f9cff6aee6b164c595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py \
python310-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python310-apipkg \
python310-iniconfig"

inherit rpm
