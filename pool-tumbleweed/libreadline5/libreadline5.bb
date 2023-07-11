SUMMARY = "The Readline Library"
DESCRIPTION = "The readline library is used by the Bourne Again Shell (bash, the \
standard command interpreter) for easy editing of command lines.  This \
includes history and search functionality."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "libreadline5-5.2-140.4.aarch64.rpm"
RPM_HASH = "011cc32f2a119ccaa8efcbd94cffbbb2323d56c98d049fea03a3d870cf947c60e1c4f5ba261d622183c6185aac824adc3c2dcfdcc857d442d929884ab40381c2"

RPROVIDES:${PN} += "bash-/lib64/libreadline.so.5 \
libhistory.so.5 \
libreadline.so.5 \
libreadline5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
