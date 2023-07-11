SUMMARY = "The Readline Library"
DESCRIPTION = "The readline library is used by the Bourne Again Shell (bash, the \
standard command interpreter) for easy editing of command lines.  This \
includes history and search functionality."
LICENSE = "GPL-3.0-or-later"

PV = "8.2"

RPM_NAME = "libreadline8-8.2-2.4.aarch64.rpm"
RPM_HASH = "eef4482a70c71eebf3ded75fc7dce13604f24cc621cd3d88758e73704b9c72f6f79097792172dfb05147cb8b9bfa64675948c0c08d00009a697aacf1f8377ac6"

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
