SUMMARY = "Tool to launch jobs, organize the output, and dissect the results"
DESCRIPTION = "PyViz-Comms offers a simple bidirectional communication architecture \
for PyViz tools including support for Jupyter comms in both the \
classic notebook and Jupyterlab."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python311-pyviz-comms-2.2.1-1.5.noarch.rpm"
RPM_HASH = "c3864f91db2b2f0b05bc1b9efc100733025ba14fce58a2b107bf933771a25e330e46dd53092e908d23f5a685e0714f7fefdca5b10bdbf04d367e49403b49ce27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyviz-comms \
python3.11dist-pyviz-comms \
python311-pyviz-comms \
python3dist-pyviz-comms"

RDEPENDS:${PN} += "python-abi \
python311-param"

inherit rpm
