SUMMARY = "The Readline Library"
DESCRIPTION = "The readline library is used by the Bourne Again Shell (bash, the \
standard command interpreter) for easy editing of command lines.  This \
includes history and search functionality."
LICENSE = "GPL-3.0-or-later"

PV = "8.2"

RPM_NAME = "libreadline8-8.2-2.3.aarch64.rpm"
RPM_HASH = "77e2d4c93f24f9959a403ec3b623aae038cddde99055d22160aa3397565015815dd346ef4510acddc0b27688b5df51240ecefe682b8b7bd7ad72367e286da18d"

RPROVIDES:${PN} += "bash-/lib64/libreadline.so.8 \
libhistory.so.8 \
libreadline.so.8 \
libreadline8 \
readline"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
