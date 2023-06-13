SUMMARY = "Header files for libattr"
DESCRIPTION = "This package contains the libraries and header files needed to develop \
programs which make use of extended attributes. For Linux programs, the \
documented system call API is the recommended interface, but an SGI \
IRIX compatibility interface is also provided."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.1"

RPM_NAME = "libattr-devel-2.5.1-1.20.aarch64.rpm"
RPM_HASH = "235503e8e7ae7ad6aebd5c4c272af1f26446447395eb3fbdbdf91c6ff1a6edbeb7eb0deb44b16ea19e8288cfa9adf3ff6835360ce506449dda4ec6a3ecff9104"

RPROVIDES:${PN} += "attr-devel \
libattr-devel \
libattr-devel(aarch-64) \
pkgconfig(libattr)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libattr1"

inherit rpm
