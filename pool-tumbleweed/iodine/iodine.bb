SUMMARY = "IPv4-through-DNS tunnel server and client"
DESCRIPTION = "This software lets one tunnel IPv4 data through a DNS server. This \
can be usable in different situations where internet access is \
firewalled, but DNS queries are allowed."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "iodine-0.7.0-10.8.aarch64.rpm"
RPM_HASH = "d9c4ff57b6b577cb8913bde2add903d688c1340a539c99ba4f32c6540057c633e7f3ae93a80e42978502567c7c2af0b07361a11ae1acb1bc21651766fcfd1a6b"

RPROVIDES:${PN} += "group-iodined \
iodine \
user-iodined"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-nobody \
libc.so.6 \
libz.so.1 \
net-tools-deprecated \
sysuser-shadow"

inherit rpm
