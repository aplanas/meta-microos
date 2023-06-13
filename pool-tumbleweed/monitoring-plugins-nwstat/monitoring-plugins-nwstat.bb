SUMMARY = "Check MRTGEXT NLM running"
DESCRIPTION = "This plugin attempts to contact the MRTGEXT NLM running on a Novell server to \
gather the requested system information."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-nwstat-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "ac8cc21b7962a0d2e29b538bf1e04febece1af135640cb45dcb9173af0779ffd42e9bb24af049bd4ede7a46d9a1cd4ecf002fabaeed23caa2373d4564d66d1d8"

RPROVIDES:${PN} += "monitoring-plugins-nwstat \
monitoring-plugins-nwstat(aarch-64) \
nagios-plugins-nwstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
