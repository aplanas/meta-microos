SUMMARY = "The system GNU Compiler documentation"
DESCRIPTION = "The system GNU Compiler documentation."
LICENSE = "GFDL-1.2-only"

PV = "13"

RPM_NAME = "gcc-info-13-1.3.aarch64.rpm"
RPM_HASH = "0059521cbe7fb2c85950507c33061029803c18052940cb64b14bd4e684f8411b3fd57a303fec59d446373f0b9876ba02351b5e8ff93fccfde0b351ae86ea8ec1"

RPROVIDES:${PN} += "gcc-info"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc13-info"

inherit rpm
