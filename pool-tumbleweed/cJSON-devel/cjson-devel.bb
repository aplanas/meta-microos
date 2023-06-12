SUMMARY = "Development files for the cJSON library"
DESCRIPTION = "A simple JSON parser library written in ANSI C. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcjson."
LICENSE = "MIT"

PV = "1.7.15"

RPM_NAME = "cJSON-devel-1.7.15-1.8.aarch64.rpm"
RPM_HASH = "484c249fac57dbe0c34d08852f143a2bfd63c872dd40718be13e415d526832ce1dfabb83dec8538ca08e538856b675d504eb5f730b09213dd6ebf0e60b6d0f59"

RPROVIDES:${PN} += "cJSON-devel \
cJSON-devel(aarch-64) \
cmake(cJSON) \
pkgconfig(libcjson)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcjson1"

inherit rpm
