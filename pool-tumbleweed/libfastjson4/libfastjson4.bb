SUMMARY = "JSON parsing library"
DESCRIPTION = "A JSON parsing library, a fork of json-c, developed by the rsyslog team \
and used for rsyslog and liblognorm. \
 \
This package includes the libfastjson library."
LICENSE = "MIT"

PV = "1.2304.0"

RPM_NAME = "libfastjson4-1.2304.0-1.1.aarch64.rpm"
RPM_HASH = "a2ff82eb896ddf9f124e798b8df063288eaa925c9921ebc0175901bf24e230d64661eec3057a1aad4a01e0780fb9a03240f19114d84aa5147f8cc7af84aeab7f"

RPROVIDES:${PN} += "libfastjson.so.4 \
libfastjson4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
