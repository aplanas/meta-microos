SUMMARY = "TIST plugin for connman"
DESCRIPTION = "Provides TI Shared Transport support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-tist-1.41-4.7.aarch64.rpm"
RPM_HASH = "51a78749cfd7a46dae99f1686316e2462be7d38e163da4039513080693ccabc465c7fc9f181deee128b38a6350b7450580781c0295b73bfd5fa9d07f5d3eaa4b"

RPROVIDES:${PN} += "connman-plugin-tist \
connman-plugin-tist(aarch-64)"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
