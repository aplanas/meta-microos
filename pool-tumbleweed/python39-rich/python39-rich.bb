SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.1"

RPM_NAME = "python39-rich-13.4.1-1.3.noarch.rpm"
RPM_HASH = "d926088e5588f6341565b347fea64120a2577114e3e87f59fcd764d2e825949616fb564d574877c253198c47108cf537eeaa4abfd354ce7067cc5c0faabf3dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rich \
python39-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python39-markdown-it-py \
python39-pygments"

inherit rpm
