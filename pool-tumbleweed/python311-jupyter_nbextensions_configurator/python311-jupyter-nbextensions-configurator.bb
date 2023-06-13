SUMMARY = "Configuration interfaces for nbextensions"
DESCRIPTION = "The jupyter_nbextensions_configurator jupyter server extension provides \
graphical user interfaces for configuring which nbextensions are enabled (load \
automatically for every notebook), and display their readme files. \
In addition, for extensions which include an appropriate yaml descriptor file, \
the interface also provides controls to configure the extensions' options. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python311-jupyter_nbextensions_configurator-0.6.3-1.1.noarch.rpm"
RPM_HASH = "7fce2cef483adf9b0545bf7d11b21db8c5a869fa774cfd180c833af8ebbc19577a46c03210d57e7bc13dd3fe0f50211ef01c478b6f287f533e056c09f4c5ef8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-nbextensions-configurator) \
python311-jupyter_nbextensions_configurator \
python3dist(jupyter-nbextensions-configurator)"

RDEPENDS:${PN} += "jupyter-jupyter_nbextensions_configurator \
python(abi) \
python311-PyYAML \
python311-jupyter_contrib_core \
python311-jupyter_core \
python311-notebook \
python311-tornado \
python311-traitlets"

inherit rpm
