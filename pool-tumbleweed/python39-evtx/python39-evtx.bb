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

RPM_NAME = "python39-evtx-0.7.4-3.12.noarch.rpm"
RPM_HASH = "03dd30ba5ebbb6848533e81574bc6a00b3052bc5e134220eee2da143af653c190fe1040c14cfa7e8b9cb98e65e0818b7e7c42d4502b4f7135b520accf60d1935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-evtx) \
python39-evtx \
python3dist(python-evtx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-hexdump \
python39-lxml \
python39-six"

inherit rpm
