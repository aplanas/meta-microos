SUMMARY = "Tool to launch jobs, organize the output, and dissect the results"
DESCRIPTION = "PyViz-Comms offers a simple bidirectional communication architecture \
for PyViz tools including support for Jupyter comms in both the \
classic notebook and Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python39-pyviz-comms-2.2.1-1.3.noarch.rpm"
RPM_HASH = "99c33ad570f6eeeff7051a98851893fb166917f56ec11166df214a533d0fac62324879dc395370c0bf536209aa69149869107f7e9174dc14cbc9dffbadf64aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyviz-comms) \
python39-pyviz-comms \
python39-pyviz_comms \
python3dist(pyviz-comms)"
RDEPENDS:${PN} += "python(abi) \
python39-param"

inherit rpm
