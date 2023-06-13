SUMMARY = "Brazilian ispell dictionary"
DESCRIPTION = "This package includes a ready Brazilian dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-brazilian-1.5-422.6.aarch64.rpm"
RPM_HASH = "21eb3d8fc95c5253e495bd56c6653c293008a2d6532fe86815019dbf7772ec5ab4344654f6c921c2a22580287fd6e371830b4f07f20752fc1887920f900d149e"

RPROVIDES:${PN} += "ispell-brazilian \
ispell-brazilian(aarch-64) \
ispell_dictionary \
locale(ispell:pt_BR)"

RDEPENDS:${PN} += "/usr/bin/awk"

inherit rpm
