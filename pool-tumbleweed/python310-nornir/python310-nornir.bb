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

RPM_NAME = "python310-nornir-3.3.0-1.8.noarch.rpm"
RPM_HASH = "5e24973141eb6389d753de628bbadcfc0a25e323ab4919f4de71ecfd7bfbf890781d7da77fbefb1dcece2f4188ab9ad90d9d4a0c12254476724b285b6188b34e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nornir \
python3.10dist-nornir \
python310-nornir \
python3dist-nornir"

RDEPENDS:${PN} += "python-abi \
python310-mypy-extensions \
python310-ruamel.yaml \
python310-typing-extensions"

inherit rpm
