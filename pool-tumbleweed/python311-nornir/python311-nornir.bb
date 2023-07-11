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

RPM_NAME = "python311-nornir-3.3.0-1.10.noarch.rpm"
RPM_HASH = "7dd05ce1f0896593f5a5e47ed72959d62f852fc505e6f035b7e797413cfb64b7782e9f079cd1ddc306c6f73fc2abf94af094eb742b42316f7a2eb321d73880f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nornir \
python3.11dist-nornir \
python311-nornir \
python3dist-nornir"

RDEPENDS:${PN} += "python-abi \
python311-mypy-extensions \
python311-ruamel.yaml \
python311-typing-extensions"

inherit rpm
