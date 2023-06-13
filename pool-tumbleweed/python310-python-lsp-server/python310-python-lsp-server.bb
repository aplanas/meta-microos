SUMMARY = "Python Language Server for the Language Server Protocol"
DESCRIPTION = "Python Language Server for the Language Server Protocol \
 \
Fork of the python-language-server project, maintained by \
the Spyder IDE team and the community \
 \
If the respective recommended packages are installed, the following optional providers \
will be enabled: \
 \
- Rope for Completions and renaming \
- Pyflakes linter to detect various errors \
- McCabe linter for complexity checking \
- pycodestyle linter for style checking \
- pydocstyle linter for docstring style checking (disabled by default) \
- autopep8 for code formatting \
- YAPF for code formatting (preferred over autopep8)"
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "python310-python-lsp-server-1.7.2-2.1.noarch.rpm"
RPM_HASH = "618c94256c09c74cacba55712d377d71cc376aa11394428d1aa7d46074a103687b43cdb803a349fc287831a4ae9ed5cb199627ececf4fa2ee77b698172a56d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-server \
python3.10dist(python-lsp-server) \
python310-python-lsp-server \
python3dist(python-lsp-server)"

RDEPENDS:${PN} += "(python310-jedi >= 0.17.2 with python310-jedi < 0.19.0) \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-docstring-to-markdown \
python310-pluggy \
python310-python-lsp-jsonrpc \
python310-setuptools \
python310-ujson \
update-alternatives"

inherit rpm
