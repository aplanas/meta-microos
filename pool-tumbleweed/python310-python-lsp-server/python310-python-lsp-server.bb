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

RPM_NAME = "python310-python-lsp-server-1.7.4-1.1.noarch.rpm"
RPM_HASH = "2192b215a787c6e6f21414b6d12d18db5f575ee8ce87a72d8405cf5e85720f88b53a0ef88800be6d885ddbc564bbc3bc902d093b222779b04c9a2081a5982ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-lsp-server \
python310-python-lsp-server \
python3dist-python-lsp-server"

RDEPENDS:${PN} += "-python310-jedi >= 0.17.2 with python310-jedi < 0.19.0 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docstring-to-markdown \
python310-pluggy \
python310-python-lsp-jsonrpc \
python310-setuptools \
python310-ujson \
update-alternatives"

inherit rpm
