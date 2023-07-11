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

RPM_NAME = "python310-nornir-3.3.0-1.10.noarch.rpm"
RPM_HASH = "489dc069aff6a91b8db303316dcb144421e19eeaccf5414381f931889155686bb5db02039ceb173b5a32ee5c4577bf67ab4fa29d5401c1c1a5caf98341ef671f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nornir \
python310-nornir \
python3dist-nornir"

RDEPENDS:${PN} += "python-abi \
python310-mypy-extensions \
python310-ruamel.yaml \
python310-typing-extensions"

inherit rpm
