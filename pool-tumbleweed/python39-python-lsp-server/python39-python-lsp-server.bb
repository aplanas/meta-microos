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

RPM_NAME = "python39-python-lsp-server-1.7.4-1.1.noarch.rpm"
RPM_HASH = "b5b206476101aa1986718a5d881fb2ff2d41f9651dbe0ef51e577c4902e92583a72ba00b90ad0948d5c99140e2a5864b93fa2024361a4a07e7801b89a0848092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-lsp-server \
python39-python-lsp-server \
python3dist-python-lsp-server"

RDEPENDS:${PN} += "-python39-jedi >= 0.17.2 with python39-jedi < 0.19.0 \
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
