SUMMARY = "Tool to launch jobs, organize the output, and dissect the results"
DESCRIPTION = "PyViz-Comms offers a simple bidirectional communication architecture \
for PyViz tools including support for Jupyter comms in both the \
classic notebook and Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python310-pyviz-comms-2.2.1-1.3.noarch.rpm"
RPM_HASH = "175881640b1d909c340650e496f4645b5d603972fe203799dff4a2237f7d6c99ead1290fdd7e87657e1e99acf9cf65cd004de190312e9b2b054c5d0480081fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyviz-comms \
python3-pyviz_comms \
python3.10dist(pyviz-comms) \
python310-pyviz-comms \
python310-pyviz_comms \
python3dist(pyviz-comms)"

RDEPENDS:${PN} += "python(abi) \
python310-param"

inherit rpm
