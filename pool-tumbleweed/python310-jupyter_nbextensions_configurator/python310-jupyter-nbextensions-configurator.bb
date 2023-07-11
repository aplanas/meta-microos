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

RPM_NAME = "python310-jupyter_nbextensions_configurator-0.6.3-1.2.noarch.rpm"
RPM_HASH = "8a4f0ad09cfac39930fef2da1dc7b6e558260211d2e0917866e5c19e9f113c5d78e13790d6e4ef67e9f9c199bcc79b52813c1373548a8e07dbe4d045045eff79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-nbextensions-configurator \
python310-jupyter-nbextensions-configurator \
python3dist-jupyter-nbextensions-configurator"

RDEPENDS:${PN} += "jupyter-jupyter-nbextensions-configurator \
python-abi \
python310-PyYAML \
python310-jupyter-contrib-core \
python310-jupyter-core \
python310-notebook \
python310-tornado \
python310-traitlets"

inherit rpm
