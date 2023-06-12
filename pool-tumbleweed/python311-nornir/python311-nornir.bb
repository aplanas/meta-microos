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

RPM_NAME = "python311-nornir-3.3.0-1.8.noarch.rpm"
RPM_HASH = "1c16d359896cdda4c05cc5c81d86fd69af82dd111065919471d0bf71cb5ab1e3d2ae669de5aa366b3cff7a5bc266c665754b6a22c391108d343f3b283c3a216b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nornir) \
python311-nornir \
python3dist(nornir)"
RDEPENDS:${PN} += "python(abi) \
python311-mypy_extensions \
python311-ruamel.yaml \
python311-typing_extensions"

inherit rpm
