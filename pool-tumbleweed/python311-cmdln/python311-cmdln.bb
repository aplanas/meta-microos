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

RPM_NAME = "python311-cmdln-2.0.0-3.11.noarch.rpm"
RPM_HASH = "3385cc22b4731f02c84ee86614bf96aafbafd23ccc4f9dc864152aeb9bc8cff75bb383d17165d66093cd0fa0cb4baaf6592aea9b443ae7fb3b92b437f50e34bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cmdln \
python311-cmdln \
python3dist-cmdln"

RDEPENDS:${PN} += "python-abi"

inherit rpm
