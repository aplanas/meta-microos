SUMMARY = "Norwegian ispell dictionary"
DESCRIPTION = "This package includes a ready Norwegian dictionary for ispell. A \
short usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-norsk-1.5-422.6.aarch64.rpm"
RPM_HASH = "e475b96f5b90796e73d35d14f98b32bf4e1086ef7c05d085a2676a6028c622acee12634357d3d9831dbb11ad2993d73594e95cfff7faf490edf2a14ce87a29bc"

RPROVIDES:${PN} += "inorsk \
ispell-dictionary \
ispell-norsk \
locale-ispell-nb;nn;no;se-NO"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
