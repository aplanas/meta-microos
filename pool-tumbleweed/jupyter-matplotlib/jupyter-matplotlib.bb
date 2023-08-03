SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.3"

RPM_NAME = "jupyter-matplotlib-0.11.3-10.3.noarch.rpm"
RPM_HASH = "533014149d70928fbc3f70c71a2ff98150490c8551000c6eef5c654f31a683a9d0ae7d18b961a03f2f1ab5b9d001e894f54bee2a0d6479d804d47864209bf7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl \
jupyter-matplotlib"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipympl"

inherit rpm
