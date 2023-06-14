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

RPM_NAME = "python310-python-lsp-black-1.2.1-1.4.noarch.rpm"
RPM_HASH = "70a431587ce59c53bf1b68a648d7e72d900c529578c8698f0fe6b96a07c86de9c21cc5057480a06438d7dceb085a1216be3da60d2220ebcfacf316a712f644c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-black \
python3.10dist-python-lsp-black \
python310-python-lsp-black \
python3dist-python-lsp-black"

RDEPENDS:${PN} += "python-abi \
python310-black \
python310-python-lsp-server \
python310-toml"

inherit rpm
