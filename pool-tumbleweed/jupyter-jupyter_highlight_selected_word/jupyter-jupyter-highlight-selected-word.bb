SUMMARY = "Jupyter notebook extension to highlight every instance of the current word"
DESCRIPTION = "Jupyter notebook extension that enables highlighting of all instances of the \
currently-selected or cursor-adjecent word in either the current cell's editor, \
or in the whole notebook. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "jupyter-jupyter_highlight_selected_word-0.2.0-8.6.noarch.rpm"
RPM_HASH = "baedc93c2c0df641560a49b0f9c38e742f56c06f2ee7f50a6eb196cef28a7bf48c1b7471034496942627abe69fe568228cf1f1725ea4b824fd2a5f21c29b82a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-highlight-selected-word"

RDEPENDS:${PN} += "jupyter-notebook \
python3-jupyter-highlight-selected-word"

inherit rpm
