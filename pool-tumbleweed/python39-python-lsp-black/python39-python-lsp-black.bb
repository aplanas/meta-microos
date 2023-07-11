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

RPM_NAME = "python39-python-lsp-black-1.3.0-1.1.noarch.rpm"
RPM_HASH = "c3574cb1b2d1977a58ad009268ec2645a865c1d59a92a7ca3780f887cf1e969b600fe0a1fe2b906a67fa2b453475d676cc2d1f0efce3426cb0dca62d21adb551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-lsp-black \
python39-python-lsp-black \
python3dist-python-lsp-black"

RDEPENDS:${PN} += "python-abi \
python39-black \
python39-python-lsp-server \
python39-tomli"

inherit rpm
