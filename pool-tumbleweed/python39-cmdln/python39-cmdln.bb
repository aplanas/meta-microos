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

RPM_NAME = "python39-cmdln-2.0.0-3.13.noarch.rpm"
RPM_HASH = "31a02a399e5ec6cea09835927dbc175c65a5a174caa3c812f847eee268056016721bfcb616f9cd076702bf7ca426d0dbe80a93fcc8a7e7c1d7b1083eca73db5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cmdln \
python39-cmdln \
python3dist-cmdln"

RDEPENDS:${PN} += "python-abi"

inherit rpm
