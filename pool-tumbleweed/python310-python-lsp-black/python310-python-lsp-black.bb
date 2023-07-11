SUMMARY = "Black plugin for the Python LSP Server"
DESCRIPTION = "Black plugin for the Python LSP Server \
 \
To avoid unexpected results you should make sure yapf and autopep8 are not installed. \
 \
- pyls-black can either format an entire file or just the selected text. \
- The code will only be formatted if it is syntactically valid Python. \
- Text selections are treated as if they were a separate Python file. \
  Unfortunately this means you can't format an indented block of code. \
- python-lsp-black will use your project's pyproject.toml if it has one."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-python-lsp-black-1.3.0-1.1.noarch.rpm"
RPM_HASH = "bbdac08ed205936be8b0403aa17e36491dd3fda940a9fd70ac1240f068535beafb5fba5f76bc4ea622c1ad58ea87d7267e255bea728e34f94c0140318fa81d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-lsp-black \
python310-python-lsp-black \
python3dist-python-lsp-black"

RDEPENDS:${PN} += "python-abi \
python310-black \
python310-python-lsp-server \
python310-tomli"

inherit rpm
