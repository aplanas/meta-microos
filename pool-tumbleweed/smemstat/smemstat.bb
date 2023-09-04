SUMMARY = "Memory usage monitoring tool"
DESCRIPTION = "Smemstat reports the physical memory usage taking into consideration shared \
memory. The tool can either report a current snapshot of memory usage or \
periodically dump out any changes in memory."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.12"

RPM_NAME = "smemstat-0.02.12-1.1.aarch64.rpm"
RPM_HASH = "4ef7f42305cbca484acbb231da60eacbf48939e157f991cfda05f24119f324c4506cc57e17777565c1041941aee9ea3a63c74d658b5b7a4dd569654db57ee459"

RPROVIDES:${PN} += "smemstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
