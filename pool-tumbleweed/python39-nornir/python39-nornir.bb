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

RPM_NAME = "python39-nornir-3.3.0-1.8.noarch.rpm"
RPM_HASH = "6440284804868829ae3b97da6d70b72590533a364a714fe86dee43d3a47ee03226558f20933af7000a9819e1598ff4a7bbe9bd5315be66bf7de03245923eb8c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nornir) \
python39-nornir \
python3dist(nornir)"

RDEPENDS:${PN} += "python(abi) \
python39-mypy_extensions \
python39-ruamel.yaml \
python39-typing_extensions"

inherit rpm
