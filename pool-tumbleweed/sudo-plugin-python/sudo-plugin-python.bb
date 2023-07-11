SUMMARY = "Plugin API for python"
DESCRIPTION = "This package contains the sudo plugin which allows to write sudo plugins \
in python. The API closely follows the C sudo plugin API described by \
sudo_plugin(5)."
LICENSE = "ISC"

PV = "1.9.13p3"

RPM_NAME = "sudo-plugin-python-1.9.13p3-3.3.aarch64.rpm"
RPM_HASH = "9221a984cb911ee42ce86b9ec541a60466483749bd601c56f557e3dce3e663bff7bf3979794241bedb2d05fb039b7998f525a769472874b0192c0b38c065ae22"

RPROVIDES:${PN} += "sudo-plugin-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libsudo-util.so.0 \
sudo"

inherit rpm
