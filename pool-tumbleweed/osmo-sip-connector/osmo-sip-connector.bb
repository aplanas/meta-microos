SUMMARY = "MNCC to SIP bridge for osmo-nitb"
DESCRIPTION = "Use the osmo-nitb MNCC interface and bridge it to SIP."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "osmo-sip-connector-1.6.0-1.10.aarch64.rpm"
RPM_HASH = "407961e62041486f389cd740ad20f3e01e4f5aefb098809a4e60f8f1969c62bdec7fe4323af411cfcc86509894156f2c153d5ae957c61ce87873cf152e0aa2ff"

RPROVIDES:${PN} += "config(osmo-sip-connector) \
osmo-sip-connector \
osmo-sip-connector(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libosmovty.so.9()(64bit) \
libsofia-sip-ua-glib.so.3()(64bit) \
libsofia-sip-ua.so.0()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
systemd"

inherit rpm