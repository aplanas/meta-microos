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

RPM_NAME = "python311-jupyter_nbextensions_configurator-0.6.3-1.2.noarch.rpm"
RPM_HASH = "a61bb9b9cd867c80499e5724284b6389cae14e706d22a933ce6a90e619e1811b564e30ff34a7667f72e5bd26ee29b4da1870a328ffe7bbcd9735296d4c093b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-nbextensions-configurator \
python3.11dist-jupyter-nbextensions-configurator \
python311-jupyter-nbextensions-configurator \
python3dist-jupyter-nbextensions-configurator"

RDEPENDS:${PN} += "jupyter-jupyter-nbextensions-configurator \
python-abi \
python311-PyYAML \
python311-jupyter-contrib-core \
python311-jupyter-core \
python311-notebook \
python311-tornado \
python311-traitlets"

inherit rpm
