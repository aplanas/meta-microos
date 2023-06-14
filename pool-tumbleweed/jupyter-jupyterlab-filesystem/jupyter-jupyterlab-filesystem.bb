SUMMARY = "Common directories shared by JupyterLab packages"
DESCRIPTION = "This package provides common directories and macros used by many \
packages that depend on JupyterLab. \
 \
It also provides macros for building packages that depend on \
JupyterLab."
LICENSE = "BSD-3-Clause"

PV = "20221227"

RPM_NAME = "jupyter-jupyterlab-filesystem-20221227-12.1.noarch.rpm"
RPM_HASH = "1559cb5df0ba32e00eeba76b06250932187053c55298a10f0151504f7c88bfd88000e49150f3295cfb37276b9df1720d964c2e181e1d224e2e952eab8b4b5955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-filesystem \
jupyter-jupyterlab-macros-devel \
python310-jupyterlab-filesystem \
python310-jupyterlab-macros-devel \
python311-jupyterlab-filesystem \
python311-jupyterlab-macros-devel \
python39-jupyterlab-filesystem \
python39-jupyterlab-macros-devel \
rpm-macro--jupyter-lab-dir \
rpm-macro--jupyter-labextensions-dir \
rpm-macro--jupyter-labextensions-dir3"

RDEPENDS:${PN} += "jupyter-jupyter-core-filesystem"

inherit rpm
