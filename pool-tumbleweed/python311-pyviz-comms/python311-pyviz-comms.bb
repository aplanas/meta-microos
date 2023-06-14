SUMMARY = "Tool to launch jobs, organize the output, and dissect the results"
DESCRIPTION = "PyViz-Comms offers a simple bidirectional communication architecture \
for PyViz tools including support for Jupyter comms in both the \
classic notebook and Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python311-pyviz-comms-2.2.1-1.3.noarch.rpm"
RPM_HASH = "2fb969829c207e0aee3b0f0fee826e44adc2a872dcfad59968814dd7e59c8cd0922b39ff3cbe7f3ff60845d0e5d8b84c557c13c98c919fdc57d2ebe1baa7a644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyviz-comms \
python311-pyviz-comms \
python3dist-pyviz-comms"

RDEPENDS:${PN} += "python-abi \
python311-param"

inherit rpm
