SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-jupyterlab-templates-0.4.0-2.1.noarch.rpm"
RPM_HASH = "12e8d9cc2111805b6ba8165b762b9b418c654b68f395ca9af64f145b5cdf9b97f7568b278e3eb5e601556b1a2b0dcbf8c1b186148a07085a48bce2b6f1d8a90c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyterlab-templates \
python310-jupyter-jupyterlab-templates \
python310-jupyterlab-templates \
python3dist-jupyterlab-templates"

RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python-abi \
python310-jupyterlab"

inherit rpm
