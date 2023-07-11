SUMMARY = "The Readline Library"
DESCRIPTION = "The readline library is used by the Bourne Again Shell (bash, the \
standard command interpreter) for easy editing of command lines.  This \
includes history and search functionality."
LICENSE = "GPL-3.0-or-later"

PV = "6.3"

RPM_NAME = "libreadline6-6.3-3.4.aarch64.rpm"
RPM_HASH = "fea67c705dd170491dc02e10b0350901cd6271d1a1cacc53cfaf168c311a86f8b9a80a9c16f184ea707cc0ee4a6e864a298fc8aab29d804cbf43b6aef92ab0fc"

RPROVIDES:${PN} += "bash-/lib64/libreadline.so.6 \
libhistory.so.6 \
libreadline.so.6 \
libreadline6 \
readline"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
