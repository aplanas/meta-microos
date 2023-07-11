SUMMARY = "Python library for displaying data as tabular ASCII"
DESCRIPTION = "Python library for displaying tabular data in an ASCII table format."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python311-PTable-0.9.2-2.12.noarch.rpm"
RPM_HASH = "e5ef411ec89469dfd0dc70a7b9cbe668bdccdd4dd3e423c89556c83573a7c27dc0766daec1b08c6ea67c4a27f6b6bfad3b8a6e53c3fc8a2a4f03cd6877df3b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PTable \
python3.11dist-ptable \
python311-PTable \
python3dist-ptable"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
