SUMMARY = "Jupyter notebook extension to highlight every instance of the current word"
DESCRIPTION = "Jupyter notebook extension that enables highlighting of all instances of the \
currently-selected or cursor-adjecent word in either the current cell's editor, \
or in the whole notebook. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-jupyter_highlight_selected_word-0.2.0-8.5.noarch.rpm"
RPM_HASH = "e5252a0ddf2958be57b41de5eb59cf7780b4856a72319d6deaf446894a2027be1e422c4ed50a651120a396e884d2b8d581f0493b40addfb09bf4361ebb0cc4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-highlight-selected-word) \
python39-jupyter_highlight_selected_word \
python3dist(jupyter-highlight-selected-word)"

RDEPENDS:${PN} += "python(abi) \
python39-notebook"

inherit rpm
