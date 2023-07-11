SUMMARY = "Inline Matplotlib backend for Jupyter"
DESCRIPTION = "Matplotlib Inline Back-end for IPython and Jupyter"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python39-matplotlib-inline-0.1.6-2.1.noarch.rpm"
RPM_HASH = "60b53778c5b2def31007af6796123451daa95048203654c83b90ee485699be3e13a899c866e2e397bbb1cf2bfb90603382c9d0fed24b19f365971a6213f3fc50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-matplotlib-inline \
python39-matplotlib-inline \
python3dist-matplotlib-inline"

RDEPENDS:${PN} += "python-abi \
python39-traitlets"

inherit rpm
