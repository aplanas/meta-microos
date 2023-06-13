SUMMARY = "interface to internet SMS forwarding services"
DESCRIPTION = "smssend is a utility providing a command line interface to the GSM \
Short Message Service (SMS) via internet gateways. It requires an \
active internet connection (HTTP proxy is suitable) and may require a \
registration for such gateways. The program is quite configurable for \
other gateways than provided, examples are included. \
 \
Keep in mind that these internet to SMS gateways may not tolerate and \
may even forbid their use via scripts."
LICENSE = "GPL-2.0+"

PV = "3.4"

RPM_NAME = "smssend-3.4-179.27.aarch64.rpm"
RPM_HASH = "e7efdf2e0f913ae9786de8f23d69bec601716e2fc632d422add76166a8b962578d987ed01c092dcdf4afd8625dbfff9a47bb59acc6ce6286a7bd5686b33b42e4"

RPROVIDES:${PN} += "smssend \
smssend(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcre.so.1()(64bit)"

inherit rpm
