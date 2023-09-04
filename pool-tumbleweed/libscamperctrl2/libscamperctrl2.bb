SUMMARY = "Control library for scamper"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains thee library that provides functions to interact \
with a collection of scamper instances."
LICENSE = "GPL-2.0-only"

PV = "20230614b"

RPM_NAME = "libscamperctrl2-20230614b-1.1.aarch64.rpm"
RPM_HASH = "95792a1a69296aaaf9154376c36709b8627da4d05aa15abd11003818bc00aaef1822ef0448656b91877d6a85ebb51ee2860912de786851ac3697b3d54e2cdf54"

RPROVIDES:${PN} += "libscamperctrl.so.2 \
libscamperctrl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
