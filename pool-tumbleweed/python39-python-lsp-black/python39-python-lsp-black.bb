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

RPM_NAME = "python39-python-lsp-black-1.2.1-1.4.noarch.rpm"
RPM_HASH = "96307f0b05114fdc4143a6477dc115b42405a59a82a17f33cc2e46f8e10dd33224b66dc3c1874cf65fc5f674af455e04ff8ecc77d0ff52b127037a4cb42ca375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-lsp-black \
python39-python-lsp-black \
python3dist-python-lsp-black"

RDEPENDS:${PN} += "python-abi \
python39-black \
python39-python-lsp-server \
python39-toml"

inherit rpm
