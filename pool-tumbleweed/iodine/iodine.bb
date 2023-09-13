SUMMARY = "IPv4-through-DNS tunnel server and client"
DESCRIPTION = "This software lets one tunnel IPv4 data through a DNS server. This \
can be usable in different situations where internet access is \
firewalled, but DNS queries are allowed."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "iodine-0.7.0-11.1.aarch64.rpm"
RPM_HASH = "2be9a2506071691abdbad8b7c1ef1b9520239505428ea2e6a35359efbcadeb737d989c435d9802580f3be5c64d0f7fd6e40791ecac30ed2bb262360483ed011d"

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
