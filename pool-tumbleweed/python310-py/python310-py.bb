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

RPM_NAME = "python310-py-1.11.0-5.1.noarch.rpm"
RPM_HASH = "fd1f1e1fb476196d1acad89e5cd7ac164f4c0fa0a34bdf7c539aa4822ff02eb112188cb23ce1b9e7cfc9906209313984f3fcdb9ddc1ca00c2d0de6378cca8cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py \
python310-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python310-apipkg \
python310-iniconfig"

inherit rpm
