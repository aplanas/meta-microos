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

RPM_NAME = "python39-py-1.11.0-4.2.noarch.rpm"
RPM_HASH = "5422f69b02b08bdf2888129df2ccf3fa19c6fd528789df90992582fd94a04b498eab8ede41e7d63bfc8f0e3834592b6f40e53909ccf4507d4ebde13396ecdefc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py \
python39-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python39-apipkg \
python39-iniconfig"

inherit rpm
