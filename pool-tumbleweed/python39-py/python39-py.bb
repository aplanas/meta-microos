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

RPM_NAME = "python39-py-1.11.0-5.1.noarch.rpm"
RPM_HASH = "0b542039771d0df35ee180374feecb97857b93f6aaa6fe929ceb4a41920aeb176426e6662e760a3e1e93e7a1548fb0b43d830ccadf3f3b8d150719bb39c05eee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py \
python39-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python39-apipkg \
python39-iniconfig"

inherit rpm
