SUMMARY = "Tool to launch jobs, organize the output, and dissect the results"
DESCRIPTION = "PyViz-Comms offers a simple bidirectional communication architecture \
for PyViz tools including support for Jupyter comms in both the \
classic notebook and Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python310-pyviz-comms-2.2.1-1.5.noarch.rpm"
RPM_HASH = "270e2094134a653ac2bf1d433b817f8b3f5e16f775e8262eda604491751b2391127d275c0a53d122661b1837cff58a716a44a04f0e261176b6649b61cb2baa73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyviz-comms \
python310-pyviz-comms \
python3dist-pyviz-comms"

RDEPENDS:${PN} += "python-abi \
python310-param"

inherit rpm
