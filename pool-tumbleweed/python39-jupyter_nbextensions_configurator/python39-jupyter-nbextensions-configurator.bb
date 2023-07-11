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

RPM_NAME = "python39-jupyter_nbextensions_configurator-0.6.3-1.2.noarch.rpm"
RPM_HASH = "a2bc74c449b6ed52837538364cee9448ffdb4d5cc35c3de0e66d6a5b4361347071337d5bc178d3afc012ce2a8bc4d97848902ea3e0987773bb0094ceb7990b1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-nbextensions-configurator \
python39-jupyter-nbextensions-configurator \
python3dist-jupyter-nbextensions-configurator"

RDEPENDS:${PN} += "jupyter-jupyter-nbextensions-configurator \
python-abi \
python39-PyYAML \
python39-jupyter-contrib-core \
python39-jupyter-core \
python39-notebook \
python39-tornado \
python39-traitlets"

inherit rpm
