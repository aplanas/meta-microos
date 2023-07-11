SUMMARY = "Configuration interfaces for nbextensions"
DESCRIPTION = "The jupyter_nbextensions_configurator jupyter server extension provides \
graphical user interfaces for configuring which nbextensions are enabled (load \
automatically for every notebook), and display their readme files. \
In addition, for extensions which include an appropriate yaml descriptor file, \
the interface also provides controls to configure the extensions' options. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "jupyter-jupyter_nbextensions_configurator-0.6.3-1.2.noarch.rpm"
RPM_HASH = "66c7684731ff0a8400d91b31976d7f141459a688698decb1d9c25e4a4c044361205832bab759979c0932c13d31e7aac0552fa04be238cb4364f07e49a4056124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-nbextensions-configurator"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
jupyter-jupyter-contrib-core \
jupyter-jupyter-core \
jupyter-notebook"

inherit rpm
