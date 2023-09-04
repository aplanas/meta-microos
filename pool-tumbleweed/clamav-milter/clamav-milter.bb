SUMMARY = "ClamAV Milter compatible mail scanner"
DESCRIPTION = "ClamAV-milter is a filter for sendmail(1) mail server. It uses a \
mail scanning engine built into clamd(8). ClamAV-milter can use \
load balancing and fault tolerant techniques to connect to more \
than one clamd(8) server and seamlessly hot-swap to even the load \
between different machines and to keep scanning for viruses even \
when a server goes down."
LICENSE = "GPL-2.0-only"

PV = "0.103.9"

RPM_NAME = "clamav-milter-0.103.9-1.1.aarch64.rpm"
RPM_HASH = "73254aaafd237a8c0737221fa55e2ddeb9067e8a1fbad7fb1f76be272b43ce55b5e5a02c6b71e8ecf8eba59ccc5dbfa3e1532389bab7ad14f70f4d883023f1b1"

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
