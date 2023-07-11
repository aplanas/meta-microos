SUMMARY = "Tool to launch jobs, organize the output, and dissect the results"
DESCRIPTION = "PyViz-Comms offers a simple bidirectional communication architecture \
for PyViz tools including support for Jupyter comms in both the \
classic notebook and Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python39-pyviz-comms-2.2.1-1.5.noarch.rpm"
RPM_HASH = "6de725bcc185c1cf580d272c06a0411084be89e58cbc604472086749fcbb112e4dfceb15ff7b49b48e0ef96c5ef0cc369385555ec5f33f6937bf8139eeb5db2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyviz-comms \
python39-pyviz-comms \
python3dist-pyviz-comms"

RDEPENDS:${PN} += "python-abi \
python39-param"

inherit rpm
