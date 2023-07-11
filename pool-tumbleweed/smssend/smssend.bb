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

RPM_NAME = "smssend-3.4-179.28.aarch64.rpm"
RPM_HASH = "94c88b1c354d141afd586fe76ff86d355a76490ca98297504584f548a9c2aaf609163ec8980c947a1119b010e828df9da8e44e5e83036e14f42330de04ea28d1"

RPROVIDES:${PN} += "smssend"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre.so.1"

inherit rpm
