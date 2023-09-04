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

RPM_NAME = "python310-python-lsp-server-1.7.4-2.1.noarch.rpm"
RPM_HASH = "c72eca4d5410f71760c8bba024eb0f4727e8ef376899d1de4d090558087a175552461c00680b6f01929ebb0f94af3c4d755cab371a53fb75cdd27590528c932d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-lsp-server \
python310-python-lsp-server \
python3dist-python-lsp-server"

RDEPENDS:${PN} += "-python310-jedi >= 0.17.2 with python310-jedi < 0.20 \
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
