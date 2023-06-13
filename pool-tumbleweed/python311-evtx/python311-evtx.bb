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

RPM_NAME = "python311-evtx-0.7.4-3.12.noarch.rpm"
RPM_HASH = "e1d38da8f3832481582cf756eacdc83cd39840f903b4743e6a0fc6512a79f67f8ec5df321fe66374d0dc14954c2fa083c5f121ac72c0903ee1d265f09aea6a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-evtx) \
python311-evtx \
python3dist(python-evtx)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi) \
python311-hexdump \
python311-lxml \
python311-six"

inherit rpm
