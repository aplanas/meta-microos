SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.3"

RPM_NAME = "jupyter-matplotlib-0.11.3-10.2.noarch.rpm"
RPM_HASH = "0f54de8f43cfbf2e59d63db20e5c4a204dacdbbfd0e95af342e63da1836fe0d883762c1952e4bdceee0c2a794b1bb4f4ed0b3817e52ad672ff61026a264a8e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl \
jupyter-matplotlib"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipympl"

inherit rpm
