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

RPM_NAME = "python39-python-lsp-server-1.7.4-2.1.noarch.rpm"
RPM_HASH = "c011612df4e81b4969ed8720c8003f1d13f9b86d9302b4840dfe022f970242e4dcf5afad058e2cf6f40b1ba5ed5df22939b3bab5074d296c9b5e4d160db7f55f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-lsp-server \
python39-python-lsp-server \
python3dist-python-lsp-server"

RDEPENDS:${PN} += "-python39-jedi >= 0.17.2 with python39-jedi < 0.20 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docstring-to-markdown \
python39-pluggy \
python39-python-lsp-jsonrpc \
python39-setuptools \
python39-ujson \
update-alternatives"

inherit rpm
