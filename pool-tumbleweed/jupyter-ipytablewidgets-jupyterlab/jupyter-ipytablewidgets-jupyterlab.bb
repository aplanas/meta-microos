SUMMARY = "Jupyterlab extension for python-ipytablewidgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
This package provides the jupyterlab extension"
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "jupyter-ipytablewidgets-jupyterlab-0.3.1-1.1.noarch.rpm"
RPM_HASH = "0b9b11cb05585ea5f8a669e7dfce764ef24c7a767cb81a08c10d18ae71582df3092651c109c8bcc3b6b75c7d387a53816639a30bd5f84ec121102e1abd78e805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipytablewidgets-jupyterlab"
RDEPENDS:${PN} += "python3dist(ipytablewidgets)"

inherit rpm
