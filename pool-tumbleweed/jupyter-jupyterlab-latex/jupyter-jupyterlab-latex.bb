SUMMARY = "Jupyter Notebook server extension which acts as an endpoint for LaTeX"
DESCRIPTION = "An extension for JupyterLab which allows for live-editing of LaTeX documents."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "jupyter-jupyterlab-latex-3.1.0-2.1.noarch.rpm"
RPM_HASH = "ac145216cd9af437b49f1b499f657b7e4dc2f6dcb6237316141c5f8be3be4a839be996eee6397faf9df3fe5313dff151246517df89fad896b4b55f9b977b9d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-latex \
python3-jupyter_jupyterlab_latex \
python3-jupyterlab-latex \
python3.10dist(jupyterlab-latex) \
python3dist(jupyterlab-latex)"
RDEPENDS:${PN} += "jupyter-notebook \
python(abi) \
texlive-latex-bin"

inherit rpm
