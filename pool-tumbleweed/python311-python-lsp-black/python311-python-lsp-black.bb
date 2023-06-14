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

PV = "1.2.1"

RPM_NAME = "python311-python-lsp-black-1.2.1-1.4.noarch.rpm"
RPM_HASH = "cc261a646a6e595415ddcbf8a09bf2ad8103babfdc5a27546eaeac797b47cd8e5a090d79789faa682195e27162399c1eec9abb7518afe6bbb4abbfcc9791c84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-lsp-black \
python311-python-lsp-black \
python3dist-python-lsp-black"

RDEPENDS:${PN} += "python-abi \
python311-black \
python311-python-lsp-server \
python311-toml"

inherit rpm
