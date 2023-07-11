SUMMARY = "Network automation framework written in Python"
DESCRIPTION = "Nornir is a pure Python network automation framework intented to be used \
directly from Python. \
While most automation frameworks use their own Domain Specific Language (DSL) \
which you use to describe what you want to have done, Nornir lets you control \
everything from Python. \
What Nornir brings to the table is that it takes care of dealing with your \
inventory and manages the job of dispatching the tasks you want to run against \
your nodes and devices. The framework provides a very simple way to write \
plugins if you aren't happy with the ones we ship."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "python39-nornir-3.3.0-1.10.noarch.rpm"
RPM_HASH = "4a4e502e573dc6ebb019e379ab35aaf58d6a4f3fffe26fa8aa0cdeb93a9e5c623f419d154793183c7a4f08886224370a6bd2d89bf09007f9f13b0e00ff65b9e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nornir \
python39-nornir \
python3dist-nornir"

RDEPENDS:${PN} += "python-abi \
python39-mypy-extensions \
python39-ruamel.yaml \
python39-typing-extensions"

inherit rpm
