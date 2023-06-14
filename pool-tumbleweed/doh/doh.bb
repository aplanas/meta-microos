SUMMARY = "Simple DoH (DNS-over-HTTPS) client"
DESCRIPTION = "A libcurl-using application that resolves a host name using \
DNS-over-HTTPS (DOH). \
This code uses POST requests unconditionally for this."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "doh-0.1-1.12.aarch64.rpm"
RPM_HASH = "823367cc925b8bb3ee00bdbce34e018c5b6516a8290da431aabb7f5c5326584c16deecb9efacb0ed1373eaefe23635ae30c54eca077f93cdf6f4746327e22857"

RPROVIDES:${PN} += "doh"

RDEPENDS:${PN} += "libc.so.6 \
libcurl.so.4"

inherit rpm
