SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.5.2"

RPM_NAME = "python39-rich-13.5.2-1.1.noarch.rpm"
RPM_HASH = "6ec1a4e3534c5439eb0b78469517771a6170de04c26317d534ab645db33987fce36366e6e2767a582c3535f4451aae08734af44e4d9f8fdabcaf7f957b1b5ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rich \
python39-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python39-markdown-it-py \
python39-pygments"

inherit rpm
