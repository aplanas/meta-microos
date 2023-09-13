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

RPM_NAME = "python39-py-1.11.0-6.1.noarch.rpm"
RPM_HASH = "ad518f0638ce15960cac4afd8f3e3978e242e4f9ffb84a449d6423427df981f4ddaabf2779b06a08b82b35d13fc8582c324a741e9578d06536330387c637d47f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py \
python39-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python39-apipkg \
python39-iniconfig"

inherit rpm
