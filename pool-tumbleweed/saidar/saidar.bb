SUMMARY = "Portable System Statistics Tools"
DESCRIPTION = "This package includes a couple of useful tools that use the libstatgrab library. \
- saidar: provides a curses-based interface to viewing the current state of the system \
This extends the use of libstatgrab to people writing scripts or anything else \
that can't easily make C function calls."
LICENSE = "GPL-2.0-or-later"

PV = "0.92.1"

RPM_NAME = "saidar-0.92.1-1.6.aarch64.rpm"
RPM_HASH = "e1ff9cd00711e7d504bb925c7c254ed13c9cd9e1d29037cb97b0132c573b93d673a1851636be20f54739fe8a0a6ab9dac5ba6838c9c2eea43b9d7f5129f03236"

RPROVIDES:${PN} += "saidar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libstatgrab.so.10 \
libstatgrab10 \
libtinfo.so.6"

inherit rpm
