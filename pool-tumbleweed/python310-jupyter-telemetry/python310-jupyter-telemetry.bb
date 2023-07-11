SUMMARY = "Jupyter telemetry library"
DESCRIPTION = "*Telemetry for Jupyter Applications and extensions.* \
 \
> Telemetry (t&#601;&#712;lem&#601;tr&#275;): the process of recording and transmitting the readings of an instrument. [Oxford Dictionaries] \
 \
Jupyter Telemetry enables Jupyter Applications (e.g. Jupyter Server, Jupyter Notebook, JupyterLab, JupyterHub, etc.) to record **events**&#8212;i.e. actions by application users&#8212;and transmit them to remote (or local) destinations as **structured** data. It works with Python's standard `logging` library to handle the transmission of events allowing users to send events to local files, over the web, etc."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python310-jupyter-telemetry-0.1.0-1.14.noarch.rpm"
RPM_HASH = "bd1e66c299d2eef1e6703b08a6235311cc68fab520dc37442cc2ff21af1df302fc0c150e82442997e124d0fa1f56aaa482e6e0151cdc166bea9fc4c293d4b869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-telemetry \
python310-jupyter-telemetry \
python3dist-jupyter-telemetry"

RDEPENDS:${PN} += "python-abi \
python310-jsonschema \
python310-python-json-logger \
python310-ruamel.yaml \
python310-traitlets"

inherit rpm
