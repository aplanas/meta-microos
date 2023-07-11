SUMMARY = "Header files for libattr"
DESCRIPTION = "This package contains the libraries and header files needed to develop \
programs which make use of extended attributes. For Linux programs, the \
documented system call API is the recommended interface, but an SGI \
IRIX compatibility interface is also provided."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.1"

RPM_NAME = "libattr-devel-2.5.1-1.21.aarch64.rpm"
RPM_HASH = "a4857ce5dc65198c2eee7af29ee39193d34937237bea7e91cfe590ea0b9b6d885064ae784fdbeec9c55ae5b9cb8f0aba2f03d53837d980349fff9d3227a46164"

RPROVIDES:${PN} += "attr-devel \
libattr-devel \
pkgconfig-libattr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libattr1"

inherit rpm
