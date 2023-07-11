SUMMARY = "ClamAV Milter compatible mail scanner"
DESCRIPTION = "ClamAV-milter is a filter for sendmail(1) mail server. It uses a \
mail scanning engine built into clamd(8). ClamAV-milter can use \
load balancing and fault tolerant techniques to connect to more \
than one clamd(8) server and seamlessly hot-swap to even the load \
between different machines and to keep scanning for viruses even \
when a server goes down."
LICENSE = "GPL-2.0-only"

PV = "0.103.8"

RPM_NAME = "clamav-milter-0.103.8-1.4.aarch64.rpm"
RPM_HASH = "3bd26c7b482e7a3b5aefd23db77110ff555812342952f77ec9e483e3538cacf1ecd04b5ab5d000a87a8bd553e173652e3b8e03bdd07651592292491b405e1e5f"

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
