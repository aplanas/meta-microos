SUMMARY = "A Linux Tool to Find out What is Using Power on a Laptop"
DESCRIPTION = "PowerTOP is a program that collects the various pieces of information \
from your system and presents an overview of how well your laptop is \
doing in terms of power savings."
LICENSE = "GPL-2.0-only"

PV = "2.15"

RPM_NAME = "powertop-2.15-1.3.aarch64.rpm"
RPM_HASH = "8cbbc564d3ebd27b7e37d735f74dcd08e155ced0c38c965f63428926a94cb7fb11228cab603934c15a04f8ea0b7779327855433cd2a9795503997c856e832aa3"

RPROVIDES:${PN} += "powertop"

RDEPENDS:${PN} += "/bin/sh \
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
