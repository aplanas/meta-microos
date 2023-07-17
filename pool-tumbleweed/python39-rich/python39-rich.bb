SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.2"

RPM_NAME = "python39-rich-13.4.2-1.1.noarch.rpm"
RPM_HASH = "0416a67a1a40ca88d1e8dd16a5845ded29b06ee4b01667d527c3eabc51cebf1cc1bcca91b4033b42293bd9aee09eee476084bc2cbefeb0c35efe46f438bac321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rich \
python39-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python39-markdown-it-py \
python39-pygments"

inherit rpm
