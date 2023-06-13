SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.3"

RPM_NAME = "jupyter-matplotlib-0.11.3-10.1.noarch.rpm"
RPM_HASH = "7c0466d12f65e6308aa52f2f7a3f7208a525e74b28d7796b7e69c5c6c5d2b2ec27da6b26f3467e30f57c00ad1f704a9d2beb63441e8246179c2b1d16496b4938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl \
jupyter-matplotlib"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist(ipympl)"

inherit rpm
