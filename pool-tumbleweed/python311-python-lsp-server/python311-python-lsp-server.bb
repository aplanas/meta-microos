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

PV = "1.7.4"

RPM_NAME = "python311-python-lsp-server-1.7.4-1.1.noarch.rpm"
RPM_HASH = "d8c212b82d4f15cdcc18941263080ae03303bc536000171aa08c31ecdad2b4dbeaec623949b11e66b3761af63ddd76dc5c842555318f1091a88583adab8fc401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-server \
python3.11dist-python-lsp-server \
python311-python-lsp-server \
python3dist-python-lsp-server"

RDEPENDS:${PN} += "-python311-jedi >= 0.17.2 with python311-jedi < 0.19.0 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docstring-to-markdown \
python311-pluggy \
python311-python-lsp-jsonrpc \
python311-setuptools \
python311-ujson \
update-alternatives"

inherit rpm
