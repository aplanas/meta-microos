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

RPM_NAME = "python311-py-1.11.0-5.1.noarch.rpm"
RPM_HASH = "ee876454a37d8789ca26eab33c0446e0c8c84317ba76b3e8adebe4e497d4df0119fb0cef7e1995b56cbf5c39a9efad0be0cf9ea3d9c0fe74d72b8b8c33bf1c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py \
python3.11dist-py \
python311-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python311-apipkg \
python311-iniconfig"

inherit rpm
