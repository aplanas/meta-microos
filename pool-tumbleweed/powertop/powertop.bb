SUMMARY = "A Linux Tool to Find out What is Using Power on a Laptop"
DESCRIPTION = "PowerTOP is a program that collects the various pieces of information \
from your system and presents an overview of how well your laptop is \
doing in terms of power savings."
LICENSE = "GPL-2.0-only"

PV = "2.15"

RPM_NAME = "powertop-2.15-1.4.aarch64.rpm"
RPM_HASH = "f63f0c46111cb9ccfb05b2f5496e8b1cbf6f860c4d0e13be93c075974ae459644c00081e78ecc1f313812ef7e72ba3b9a88634e6c8de4c805d205312be093faa"

RPROVIDES:${PN} += "powertop"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpci.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
systemd"

inherit rpm
