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

RPM_NAME = "python311-py-1.11.0-4.2.noarch.rpm"
RPM_HASH = "b36d96fce35c85febda8d175fd6fef79489c7802d739505c90794ae12ec5c6388f5dff03ff5f17163155457db6196c80898ccc1af5d445df023312ad3f068b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py \
python3.11dist-py \
python311-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python311-apipkg \
python311-iniconfig"

inherit rpm
