SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "cross-rx-newlib-devel-4.3.0.20230120-1.3.aarch64.rpm"
RPM_HASH = "5a98405f6bcef7a864d4b6d4dd901587675baa673d438fbceeea2b5e333cde5decce1d53f99f442e30e0dcb69e7c1f7fdf385af0b73b9eb0791d527c6c8885e9"

RPROVIDES:${PN} += "cross-rx-newlib-devel cross-rx-newlib-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
