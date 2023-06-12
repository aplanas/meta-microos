SUMMARY = "An improved cmd.py for Writing Multi-command Scripts and Shells"
DESCRIPTION = "`cmdln.py` is an extension of Python's default `cmd.py` module that \
provides 'a simple framework for writing line-oriented command \
interpreters'.	The idea (with both cmd.py and cmdln.py) is to be able \
to quickly build multi-sub-command tools (think cvs or svn) and/or \
simple interactive shells (think gdb or pdb).  Cmdln's extensions make \
it more natural to write sub-commands, integrate optparse for simple \
option processing, and make having good command documentation easier."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-cmdln-2.0.0-3.11.noarch.rpm"
RPM_HASH = "cf2f9f1cc5e5dc78f33ab21f8cd1c2dbfc9d08f808427307934ba1ed94090b1b7109a83d682833446e539af07c6cd7542b98541e493bc6abf9bec6a19dcd7eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmdln \
python3.10dist(cmdln) \
python310-cmdln \
python3dist(cmdln)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
