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

RPM_NAME = "python310-py-1.11.0-6.1.noarch.rpm"
RPM_HASH = "9de478338a5b739cead3b4f5cdab1c16b844926f5883b1886e7ba5568df3b0b750f52f09ccd96263c1b15e5bcb5f341bf6d2d777c420d3f07fb8f697f02bfb90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py \
python310-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python310-apipkg \
python310-iniconfig"

inherit rpm
