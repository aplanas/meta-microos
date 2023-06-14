SUMMARY = "IPTC Metadata Tag Manipulation Library"
DESCRIPTION = "libiptcdata is a library for parsing, editing, and saving IPTC \
(International Press Telecommunications Council) data. stored within \
multimedia files such as images."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata-1.0.5-1.10.aarch64.rpm"
RPM_HASH = "d86657ad2ce1f17ed8fc952ed98c3be59a75a1503d1cc787b9f1e18eea52c89e027c091b0ac9e6208cc5f1371a7d05741f0a79be468f78d5ceb7ff5fd688726a"

RPROVIDES:${PN} += "libiptcdata"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiptcdata.so.0 \
libiptcdata0"

inherit rpm
