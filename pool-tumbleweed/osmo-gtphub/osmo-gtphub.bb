SUMMARY = "Osmocom GTP Hub: Proxy for GTP traffic between multiple SGSNs and GGSNs"
DESCRIPTION = "Osmocom GTP Hub: Proxy for GTP traffic between multiple SGSNs and GGSNs."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-gtphub-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "af918ff9cb28ee081577234ae1cee1c60ad0ccf7e9b116da0aba0e5446080fb19e3e467bc2cba566a4abde437a1711eb64512c660c63ad109c71d73a75a12c6a"

RPROVIDES:${PN} += "config(osmo-gtphub) \
osmo-gtphub \
osmo-gtphub(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcares.so.2()(64bit) \
libgtp.so.6()(64bit) \
libosmo-sigtran.so.7()(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
