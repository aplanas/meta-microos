SUMMARY = "Jupyter telemetry library"
DESCRIPTION = "*Telemetry for Jupyter Applications and extensions.* \
 \
> Telemetry (t&#601;&#712;lem&#601;tr&#275;): the process of recording and transmitting the readings of an instrument. [Oxford Dictionaries] \
 \
Jupyter Telemetry enables Jupyter Applications (e.g. Jupyter Server, Jupyter Notebook, JupyterLab, JupyterHub, etc.) to record **events**&#8212;i.e. actions by application users&#8212;and transmit them to remote (or local) destinations as **structured** data. It works with Python's standard `logging` library to handle the transmission of events allowing users to send events to local files, over the web, etc."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python311-jupyter-telemetry-0.1.0-1.14.noarch.rpm"
RPM_HASH = "b9d299a89fa5bdf11b4cdfa3e27eec2f0bfe9ccd97de0f60020e478fffa25469929dce50b5eb0f130d4bc919b3f21722893d07b74a8df8a020402d654aef9c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-telemetry \
python3.11dist-jupyter-telemetry \
python311-jupyter-telemetry \
python3dist-jupyter-telemetry"

RDEPENDS:${PN} += "python-abi \
python311-jsonschema \
python311-python-json-logger \
python311-ruamel.yaml \
python311-traitlets"

inherit rpm
