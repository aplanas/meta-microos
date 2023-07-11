SUMMARY = "Jupyter notebook extension to highlight every instance of the current word"
DESCRIPTION = "Jupyter notebook extension that enables highlighting of all instances of the \
currently-selected or cursor-adjecent word in either the current cell's editor, \
or in the whole notebook. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-jupyter_highlight_selected_word-0.2.0-8.6.noarch.rpm"
RPM_HASH = "1a51b73e1fffb8531b60a06ab5f8df2f044b57c9fbc06725fd1d3ad7db54e89c09e742570968b98f0470027586b1b475f82063418adbc2ea503cc61d5355dcd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-highlight-selected-word \
python3.11dist-jupyter-highlight-selected-word \
python311-jupyter-highlight-selected-word \
python3dist-jupyter-highlight-selected-word"

RDEPENDS:${PN} += "python-abi \
python311-notebook"

inherit rpm
