SUMMARY = "SUSE Installation Program"
DESCRIPTION = "SUSE installation program."
LICENSE = "GPL-3.0+"

PV = "9.1"

RPM_NAME = "linuxrc-9.1-1.1.aarch64.rpm"
RPM_HASH = "8fa061057a4f10b009ca1c8690c3ac3acad6a2e7ce09aa74dc2392909fee1e33fd81d25758a58f4b1a4c670af30f27407b01fa3559d5cd7942c9067b37f5ad65"

RPROVIDES:${PN} += "linuxrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcurl.so.4 \
libhd.so.23 \
libmediacheck.so.6 \
libreadline.so.8"

inherit rpm
