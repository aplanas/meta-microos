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

RPM_NAME = "python311-py-1.11.0-6.1.noarch.rpm"
RPM_HASH = "4aeba152262fd91c82440f04167d0f2be47c50e4c40dc572f3f294d7cfbf083cb4edab0888cf434ac6dc32e91b8642acdd1823a7381fbb87485a61c61dc527cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py \
python3.11dist-py \
python311-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python311-apipkg \
python311-iniconfig"

inherit rpm
