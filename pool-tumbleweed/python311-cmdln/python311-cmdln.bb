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

RPM_NAME = "python311-cmdln-2.0.0-3.13.noarch.rpm"
RPM_HASH = "ff024133356d1e639aa901db35b2074c949920c2479e1291cb8a82e2db8b135c847fb8c5aff269700309a1620856fa578a8552afa19e5d5a6776fab71b84ed60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmdln \
python3.11dist-cmdln \
python311-cmdln \
python3dist-cmdln"

RDEPENDS:${PN} += "python-abi"

inherit rpm
