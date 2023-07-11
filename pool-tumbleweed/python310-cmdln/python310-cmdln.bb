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

RPM_NAME = "python310-cmdln-2.0.0-3.13.noarch.rpm"
RPM_HASH = "94369a9fd7a4b58f98521200b68a0d0daee6bea22e8fd532f4eaae274d82338023d821d1de6e6c5428fdfbcdd798983277d768a933e1feb539abc92a7c1cc312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cmdln \
python310-cmdln \
python3dist-cmdln"

RDEPENDS:${PN} += "python-abi"

inherit rpm
