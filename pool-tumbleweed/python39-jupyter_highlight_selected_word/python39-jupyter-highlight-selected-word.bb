SUMMARY = "Jupyter notebook extension to highlight every instance of the current word"
DESCRIPTION = "Jupyter notebook extension that enables highlighting of all instances of the \
currently-selected or cursor-adjecent word in either the current cell's editor, \
or in the whole notebook. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-jupyter_highlight_selected_word-0.2.0-8.6.noarch.rpm"
RPM_HASH = "54666eed2098763c47eebc55498a3ab7df8888a0792b00320024f0bd5a6284a87dfeac644a6b6f5fbe60ac11932b0ec15583faa6fcde61fe7800a0e86e89b82d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-highlight-selected-word \
python39-jupyter-highlight-selected-word \
python3dist-jupyter-highlight-selected-word"

RDEPENDS:${PN} += "python-abi \
python39-notebook"

inherit rpm
