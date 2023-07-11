SUMMARY = "Jupyter Notebook server extension which acts as an endpoint for LaTeX"
DESCRIPTION = "An extension for JupyterLab which allows for live-editing of LaTeX documents."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "jupyter-jupyterlab-latex-3.1.0-2.2.noarch.rpm"
RPM_HASH = "2c0505ce1efa6f58626ee62d304af4bc8b5ec218699de906105f8638826538b521123c3ad43c7d4343355708846fa80e18f76d2529af364d7fe2d0e0a05d069b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-latex \
python3-jupyter-jupyterlab-latex \
python3-jupyterlab-latex \
python3.11dist-jupyterlab-latex \
python3dist-jupyterlab-latex"

RDEPENDS:${PN} += "jupyter-notebook \
python-abi \
texlive-latex-bin"

inherit rpm
