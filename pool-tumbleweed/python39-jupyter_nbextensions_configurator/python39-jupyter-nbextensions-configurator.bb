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

RPM_NAME = "python39-jupyter_nbextensions_configurator-0.6.3-1.1.noarch.rpm"
RPM_HASH = "98e7add3349e6c626d4c17a1c469ea083ba9dce796bbd6cc5bef6e2754be776091be5c907d504ad904fef856ede380e975179d0af1a78ab685a069c4baadad56"
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
