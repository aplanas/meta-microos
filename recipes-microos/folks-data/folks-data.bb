SUMMARY = "Data files for libfolks, a library to create metacontacts from many sources"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides mandatory data files for the library to work."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "folks-data-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "82822f7410a11ce7960057963ce502aaae6363f2a7c8d1b1f12dc8be098377a33c010aaaeff98558318330a74bb91cee327cd4e6f9e27a0c1e8620c855855d43"

RPROVIDES:${PN} += "folks-data folks-data(aarch-64) libfolks-data"
RDEPENDS:${PN} += ""

inherit rpm
