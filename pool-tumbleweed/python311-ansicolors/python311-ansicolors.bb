SUMMARY = "ANSI colors for Python"
DESCRIPTION = "Add ANSI colors and decorations to your strings."
LICENSE = "ISC"

PV = "1.1.8"

RPM_NAME = "python311-ansicolors-1.1.8-3.14.noarch.rpm"
RPM_HASH = "b8d284e41dc731cee80f2eae08ee6ed772071649e452fe72d6a17f0739a1b063a646b84bab18d92e2553a681be4b1784659bc3572a64ca036b23e7cb395dd341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ansicolors \
python311-ansicolors \
python3dist-ansicolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
