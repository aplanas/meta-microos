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

RPM_NAME = "python311-python-lsp-server-1.7.4-2.1.noarch.rpm"
RPM_HASH = "370dbe1a10a165af1c53ccb0e7d4d767d8b0c4eea299dfa37cbf985d7e9cfcfc725435f7d3228a55bacb1b054e7df714d5a2c2e63213b82d67f9623e4f5de6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-server \
python3.11dist-python-lsp-server \
python311-python-lsp-server \
python3dist-python-lsp-server"

RDEPENDS:${PN} += "-python311-jedi >= 0.17.2 with python311-jedi < 0.20 \
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
