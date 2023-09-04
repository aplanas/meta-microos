SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.3"

RPM_NAME = "jupyter-matplotlib-0.11.3-11.1.noarch.rpm"
RPM_HASH = "cd6c8807cb964ab967668b65bfa5570e70838102a24e52032f19f5b6ed818154fc87e6312673275bd8396c312d2e1b5c646b844080afd9b348456f653e7786df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl \
jupyter-matplotlib"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipympl"

inherit rpm
