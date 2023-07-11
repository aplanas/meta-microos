SUMMARY = "Binary files of ctanbib"
DESCRIPTION = "Binary files of ctanbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48478"

RPM_NAME = "texlive-ctanbib-bin-2023.20230311.svn48478-92.1.aarch64.rpm"
RPM_HASH = "f6691ddf49c262fe8e84a01e95459291c944c079a113686df38dcd03fd32b69f4140994899ade25243dccaf260f489fa7eb1be3c92172c76831c376729a9aa67"

RPROVIDES:${PN} += "texlive-ctanbib-bin"

RDEPENDS:${PN} += "texlive-ctanbib"

inherit rpm
