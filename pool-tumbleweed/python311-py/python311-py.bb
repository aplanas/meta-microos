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

RPM_NAME = "python311-py-1.11.0-4.1.noarch.rpm"
RPM_HASH = "b249b0e504e40b0f276d5998d424240337edbcb1e97d8412656aa5971907e6d3dc4d32876500652db08217cd391c5fd30515c67dd2ba15b7d2439408f7fae58d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(py) \
python311-py \
python3dist(py)"

RDEPENDS:${PN} += "python(abi) \
python311-apipkg \
python311-iniconfig"

inherit rpm
