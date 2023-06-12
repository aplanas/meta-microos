SUMMARY = "Jupyter telemetry library"
DESCRIPTION = "*Telemetry for Jupyter Applications and extensions.* \
 \
> Telemetry (t&#601;&#712;lem&#601;tr&#275;): the process of recording and transmitting the readings of an instrument. [Oxford Dictionaries] \
 \
Jupyter Telemetry enables Jupyter Applications (e.g. Jupyter Server, Jupyter Notebook, JupyterLab, JupyterHub, etc.) to record **events**&#8212;i.e. actions by application users&#8212;and transmit them to remote (or local) destinations as **structured** data. It works with Python's standard `logging` library to handle the transmission of events allowing users to send events to local files, over the web, etc."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python311-jupyter-telemetry-0.1.0-1.12.noarch.rpm"
RPM_HASH = "6fe1c3e29bfe511c79a900a2dd49168a68f43564830a3e51f65c10c0fcb93f4d32c4d186c9eaff1dc65d68b355cfa0cfd44051571cc5cac4bab67a7c96719833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-telemetry) \
python311-jupyter-telemetry \
python3dist(jupyter-telemetry)"
RDEPENDS:${PN} += "python(abi) \
python311-jsonschema \
python311-python-json-logger \
python311-ruamel.yaml \
python311-traitlets"

inherit rpm
