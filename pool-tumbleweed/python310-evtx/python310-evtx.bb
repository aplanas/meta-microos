SUMMARY = "Windows Event Log files parser"
DESCRIPTION = "python-evtx is a pure Python parser for recent Windows Event Log files (those \
with the file extension '.evtx'). The module provides programmatic access to the \
File and Chunk headers, record templates, and event entries. For example, you \
can use python-evtx to review the event logs of Windows 7 systems from a Mac or \
Linux workstation. The structure definitions and parsing strategies were heavily \
inspired by the work of Andreas Schuster and his Perl implementation \
'Parse-Evtx'."
LICENSE = "Apache-2.0"

PV = "0.7.4"

RPM_NAME = "python310-evtx-0.7.4-3.12.noarch.rpm"
RPM_HASH = "2ec051cbbe9f1e8f8245816542fddd6fcfb0557ee12b94797a93205240833557effa7eee4b2250443e7116f1985262cf208339ca67030bd9082f20db8234e3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-evtx \
python3.10dist-python-evtx \
python310-evtx \
python3dist-python-evtx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-hexdump \
python310-lxml \
python310-six"

inherit rpm
