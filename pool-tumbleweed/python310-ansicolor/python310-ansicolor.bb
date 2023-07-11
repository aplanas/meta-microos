SUMMARY = "Python module for ANSI color output and colored highlighting and diffing"
DESCRIPTION = "Ansicolor is a library that offers ANSI color markup for \
command line programs."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "python310-ansicolor-0.3.2-1.7.noarch.rpm"
RPM_HASH = "ce91fc69ba58fa97717f669b72d7fe2a55accad358b66e3ed0b2345224b36c81e574332ff1d10ce7e12816df7c40e6e236c148e507a6b1e4934aea7dfb7fcc98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ansicolor \
python310-ansicolor \
python3dist-ansicolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
