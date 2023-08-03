SUMMARY = "Plugin API for python"
DESCRIPTION = "This package contains the sudo plugin which allows to write sudo plugins \
in python. The API closely follows the C sudo plugin API described by \
sudo_plugin(5)."
LICENSE = "ISC"

PV = "1.9.14p1"

RPM_NAME = "sudo-plugin-python-1.9.14p1-1.1.aarch64.rpm"
RPM_HASH = "727f37525d804bcb524c997bf9598a5cfc1b966c30b5a7922a774c5fd5e5fd34af666d1202c10196bc2ee76a763860b77f38cfa6c8e9983f6aef4af6f0e0d502"

RPROVIDES:${PN} += "sudo-plugin-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libsudo-util.so.0 \
sudo"

inherit rpm
