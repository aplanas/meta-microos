SUMMARY = "Jupyter notebook extension to highlight every instance of the current word"
DESCRIPTION = "Jupyter notebook extension that enables highlighting of all instances of the \
currently-selected or cursor-adjecent word in either the current cell's editor, \
or in the whole notebook. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-jupyter_highlight_selected_word-0.2.0-8.5.noarch.rpm"
RPM_HASH = "97e42b20365a86c353a9c1d819405caa246984cf1d1b263cf96d707d55968a6f08fb2cb15f83406789e60341a2ea992b7d0982ee8129d3b3be14ea1f81514c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyter-highlight-selected-word \
python311-jupyter-highlight-selected-word \
python3dist-jupyter-highlight-selected-word"

RDEPENDS:${PN} += "python-abi \
python311-notebook"

inherit rpm
