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

RPM_NAME = "python311-python-lsp-black-1.3.0-1.1.noarch.rpm"
RPM_HASH = "9c18f449feaf1b7e3834946b7519a90adecf10343506e7ebbf4fd138e0b80cdbd401e7ae3294aee53b842c97794dc0eac73a10debde7d24009d4a6fe3eba2f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-black \
python3.11dist-python-lsp-black \
python311-python-lsp-black \
python3dist-python-lsp-black"

RDEPENDS:${PN} += "python-abi \
python311-black \
python311-python-lsp-server"

inherit rpm
