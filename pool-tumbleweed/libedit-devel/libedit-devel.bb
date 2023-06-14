SUMMARY = "Development files for libedit"
DESCRIPTION = "libedit is a command line editing and history library. It is designed \
to be used by interactive programs that allow the user to type commands \
at a terminal prompt. \
 \
This package holds the development files for libedit."
LICENSE = "BSD-3-Clause"

PV = "20210910.3.1"

RPM_NAME = "libedit-devel-20210910.3.1-2.1.aarch64.rpm"
RPM_HASH = "41977eaf47fc6154168de01f6e883df7813de6780183d1796c3690dcf73a22f3646102d00469819a4ce4b708b856264b1e0fcb6a80c76cca0e40f1c16dcc9204"

RPROVIDES:${PN} += "libedit-devel \
libedit0-devel \
pkgconfig-libedit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libedit0"

inherit rpm
