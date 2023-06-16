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

RPM_NAME = "python39-python-lsp-server-1.7.2-2.1.noarch.rpm"
RPM_HASH = "cd00dcc8e5bafc8f53ae2df52aa82575ff0e7843507edc200b4c91da783bcddf0197742bcf6153c0bfd02f0c4fa91746248e63f6aaab110effe6979da5c672a2"
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
