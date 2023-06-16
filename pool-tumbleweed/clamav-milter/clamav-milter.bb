SUMMARY = "ClamAV Milter compatible mail scanner"
DESCRIPTION = "ClamAV-milter is a filter for sendmail(1) mail server. It uses a \
mail scanning engine built into clamd(8). ClamAV-milter can use \
load balancing and fault tolerant techniques to connect to more \
than one clamd(8) server and seamlessly hot-swap to even the load \
between different machines and to keep scanning for viruses even \
when a server goes down."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "clamav-milter-0.103.8-1.3.aarch64.rpm"
RPM_HASH = "16b6e63cb70e9524908666790af79a3f97fbd05ba45aebb61f31326bf87577df74b9c54557af32b7e2ace4588f2b9ad95ad1df932d52cb41c73d735ee74251fa"

RPROVIDES:${PN} += "clamav-/usr/sbin/clamav-milter \
clamav-milter \
config-clamav-milter"

RDEPENDS:${PN} += "/usr/bin/sh \
clamav \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclamav.so.9 \
libmilter.so.1.0"

inherit rpm
