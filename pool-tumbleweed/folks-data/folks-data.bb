SUMMARY = "Data files for libfolks, a library to create metacontacts from many sources"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides mandatory data files for the library to work."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "folks-data-0.15.6-1.2.aarch64.rpm"
RPM_HASH = "e156f4170270790087998a40110dd0dd66a3d9fb9fe7c3e6ac6e6a2bf90f33a6d3d21e2c565c9d49fdb04490000197ec0e37a9419ce853469086a9ded8382fca"

RPROVIDES:${PN} += "folks-data \
libfolks-data"

RDEPENDS:${PN} += ""

inherit rpm
