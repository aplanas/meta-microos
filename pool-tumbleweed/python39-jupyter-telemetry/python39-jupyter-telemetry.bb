SUMMARY = "Jupyter telemetry library"
DESCRIPTION = "*Telemetry for Jupyter Applications and extensions.* \
 \
> Telemetry (t&#601;&#712;lem&#601;tr&#275;): the process of recording and transmitting the readings of an instrument. [Oxford Dictionaries] \
 \
Jupyter Telemetry enables Jupyter Applications (e.g. Jupyter Server, Jupyter Notebook, JupyterLab, JupyterHub, etc.) to record **events**&#8212;i.e. actions by application users&#8212;and transmit them to remote (or local) destinations as **structured** data. It works with Python's standard `logging` library to handle the transmission of events allowing users to send events to local files, over the web, etc."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python39-jupyter-telemetry-0.1.0-1.12.noarch.rpm"
RPM_HASH = "d97d5ad054ff6cf08e1926fd8c22c8f1b4a174b317ef3fc5de1c82dfeca0dde5b8c2eb96a3c5c22f6789fa7498886099d3d8cc21768f4c64244f8c2892b224cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-telemetry \
python39-jupyter-telemetry \
python3dist-jupyter-telemetry"

RDEPENDS:${PN} += "python-abi \
python39-jsonschema \
python39-python-json-logger \
python39-ruamel.yaml \
python39-traitlets"

inherit rpm
