SUMMARY = "Jupyter notebook extension to highlight every instance of the current word"
DESCRIPTION = "Jupyter notebook extension that enables highlighting of all instances of the \
currently-selected or cursor-adjecent word in either the current cell's editor, \
or in the whole notebook. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-jupyter_highlight_selected_word-0.2.0-8.6.noarch.rpm"
RPM_HASH = "ce819f97668b3c1ce4eadf90113ae250707ff5af6bcdea5b7cdd1eaf43842dc8690a4fba71cd30681853d97a66a5ef546d8015b0fbec71bb00de2c313054001e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-highlight-selected-word \
python310-jupyter-highlight-selected-word \
python3dist-jupyter-highlight-selected-word"

RDEPENDS:${PN} += "python-abi \
python310-notebook"

inherit rpm
