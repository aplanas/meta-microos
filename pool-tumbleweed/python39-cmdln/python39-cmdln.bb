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

RPM_NAME = "python39-cmdln-2.0.0-3.11.noarch.rpm"
RPM_HASH = "8961afad2bd4d04010af6e39c55ccda48e45d35223075ce130d7fb0f0b3d3172c8aa5707fdf7c598f839c429400bfe9093d91fb5565ecdb31c5ed898f7a3722a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cmdln) \
python39-cmdln \
python3dist(cmdln)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
