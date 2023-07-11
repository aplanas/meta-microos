SUMMARY = "Python module for ANSI color output and colored highlighting and diffing"
DESCRIPTION = "Ansicolor is a library that offers ANSI color markup for \
command line programs."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "python39-ansicolor-0.3.2-1.7.noarch.rpm"
RPM_HASH = "86875fc8e70f4bb4b4527a47db4a8b04a7af6311918963d5f311db880dbddf26d57f54b3c69197ab72e299b23bd44238488bc46ef727841a5935a97dd00a15d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ansicolor \
python39-ansicolor \
python3dist-ansicolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
