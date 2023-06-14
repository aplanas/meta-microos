SUMMARY = "EDID Color Management Parsing"
DESCRIPTION = "EDID parser implementing the key/value pairs needed for the ICC meta Tag for Monitor Profiles spec. \
http://www.freedesktop.org/wiki/Specifications/icc_meta_tag_for_monitor_profiles"
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcmEDID0-0.5.4-1.22.aarch64.rpm"
RPM_HASH = "9b314d1ce948af79e8780a0b943098d3a4c01e4fbbe86e36c091fd1217f6763a4177d3bcd798e1bab446179e51d00828038fbe6d70c799d6021b5f063544b7a2"

RPROVIDES:${PN} += "libXcmEDID.so.0 \
libXcmEDID0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
