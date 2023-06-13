SUMMARY = "A Linux Tool to Find out What is Using Power on a Laptop"
DESCRIPTION = "PowerTOP is a program that collects the various pieces of information \
from your system and presents an overview of how well your laptop is \
doing in terms of power savings."
LICENSE = "GPL-2.0-only"

PV = "2.15"

RPM_NAME = "powertop-2.15-1.3.aarch64.rpm"
RPM_HASH = "8cbbc564d3ebd27b7e37d735f74dcd08e155ced0c38c965f63428926a94cb7fb11228cab603934c15a04f8ea0b7779327855433cd2a9795503997c856e832aa3"

RPROVIDES:${PN} += "powertop \
powertop(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libpci.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
systemd"

inherit rpm
