SUMMARY = "Documentation for xyscan"
DESCRIPTION = "xyscan is a tool for scientists in need of extracting data points, \
i.e. numeric values, from a plot. \
 \
This package contains the documentation and help files for xyscan."
LICENSE = "GPL-3.0-or-later"

PV = "4.64"

RPM_NAME = "xyscan-doc-4.64-1.6.noarch.rpm"
RPM_HASH = "70a6c617b4baa2695dc5a9166e416958ae0b582fcaf12296d72a53c7dcedc00fb700d4f4ec373aed6059a864c45077f4de03c5e9f5d204b19fee768a6933df10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xyscan-doc"
RDEPENDS:${PN} += "xyscan"

inherit rpm
