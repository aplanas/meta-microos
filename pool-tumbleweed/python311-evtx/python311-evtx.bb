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

RPM_NAME = "python311-evtx-0.7.4-3.14.noarch.rpm"
RPM_HASH = "02b9f289ed259ed00a3e3704d359b2a101b606301bdc5687840088297fea847a090b9f0d8ed553ac4b36483f10eca53e24eaa4878200ee48e6356837efc75a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-evtx \
python3.11dist-python-evtx \
python311-evtx \
python3dist-python-evtx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-hexdump \
python311-lxml \
python311-six"

inherit rpm
