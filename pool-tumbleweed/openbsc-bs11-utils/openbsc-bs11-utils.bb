SUMMARY = "Command line utilities for Siemens BS-11 BTS"
DESCRIPTION = "There is a tool in this package for configuring the Siemens BS-11 BTS. \
Additionally, it contains one tool for making use of an ISDN-card and the \
public telephone network as frequency standard for the E1 line."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "openbsc-bs11-utils-1.4.1-1.10.aarch64.rpm"
RPM_HASH = "4b7282e61f66921a12619dfd96a09873e367ee3218a740134bf2644eff5a3484203800a308609610ef0bff334243369ce99d534ab680a0acdfa4e51b0a4fd66b"

RPROVIDES:${PN} += "openbsc-bs11-utils \
openbsc-bs11-utils(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libosmoabis.so.10()(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libtalloc.so.2()(64bit)"

inherit rpm
