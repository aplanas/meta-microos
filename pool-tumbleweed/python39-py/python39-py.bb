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

RPM_NAME = "python39-py-1.11.0-4.1.noarch.rpm"
RPM_HASH = "a8e1c8b58a3ddfe45dce94ac35a96618780157399956ec33d16016a15c5c3f36cf7d59565891a61de4c905d8a1b13089cf65d551d7de2b67db9611d1a4851c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py \
python39-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python39-apipkg \
python39-iniconfig"

inherit rpm
