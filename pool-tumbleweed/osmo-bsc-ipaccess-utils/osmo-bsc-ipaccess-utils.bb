SUMMARY = "Command line utilities for ip.access nanoBTS"
DESCRIPTION = "This package contains utilities that are specific for nanoBTS when being \
used together with OpenBSC. It contains mainly two tools: ipaccess-config \
and ipaccess-proxy."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-ipaccess-utils-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "bbcc225d73d4f796ee069fc79f61229eed6786191df30479f9da2970195a529bd28c6c4522b534192440656cac52d4b0287ab67c3cc943438124cdffe7064589"

RPROVIDES:${PN} += "osmo-bsc-ipaccess-utils \
osmo-bsc-ipaccess-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libosmo-mgcp-client.so.9()(64bit) \
libosmo-sigtran.so.7()(64bit) \
libosmoabis.so.10()(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libosmonetif.so.11()(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit)"

inherit rpm
