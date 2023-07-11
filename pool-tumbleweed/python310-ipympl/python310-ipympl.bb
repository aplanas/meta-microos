SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python310-ipympl-0.9.3-10.2.noarch.rpm"
RPM_HASH = "fc3fd2470dbdf76b9b2bad0e8b233fa1c830f0b42876f876b9eefef02474c9031336d255b9149263b87c4e87b1e5c4d9738888abd189bdf88c7ca339feea827c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipympl \
python310-ipympl \
python310-jupyter-ipympl \
python3dist-ipympl"

RDEPENDS:${PN} += "-python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9 \
-python310-matplotlib >= 3.4.0 with python310-matplotlib < 4 \
jupyter-matplotlib \
python-abi \
python310-Pillow \
python310-ipython \
python310-ipython-genutils \
python310-matplotlib-web \
python310-numpy \
python310-traitlets"

inherit rpm
