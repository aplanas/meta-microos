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

RPM_NAME = "python39-evtx-0.7.4-3.14.noarch.rpm"
RPM_HASH = "1062044b905f0452db0645415c6cd76c4e5fc3921661fed0962535cde2f3a5f8b4dd8f9528902f8222d50b9367ebf798eadf42bdd5f31768d11bf9240f320aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-evtx \
python39-evtx \
python3dist-python-evtx"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-hexdump \
python39-lxml \
python39-six"

inherit rpm
