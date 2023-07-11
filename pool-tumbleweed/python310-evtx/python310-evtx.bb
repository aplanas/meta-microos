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

RPM_NAME = "python310-evtx-0.7.4-3.14.noarch.rpm"
RPM_HASH = "b113ddca86416701632282f1bd6f016b4592e959169e4467c36f0175054ed8cf8fdcad8d6d9ff59901f7fdd11fe9ad6f8116a2b57b9e061695e194f0afa9a992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-evtx \
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
