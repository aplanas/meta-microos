SUMMARY = "development files for the Linux Power Capping Framework"
DESCRIPTION = "This project provides the powercap library -- a generic C interface to the \
Linux power capping framework (sysfs interface). It includes an implementation \
for working with Intel Running Average Power Limit (RAPL). \
 \
This package provides the devel files."
LICENSE = "GPL-2.0-only"

PV = "0.6.0"

RPM_NAME = "powercap-devel-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "7530bb4aa374b0b8baed92d8af7d5a44291400cdf0fcf17bc0105ba83e89aec85cac161a7a1b94fa866ba23f7e2ffc7a253af80f571b483d9616f43e01496c9b"

RPROVIDES:${PN} += "cmake(Powercap) \
pkgconfig(powercap) \
powercap-devel \
powercap-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
powercap"

inherit rpm
