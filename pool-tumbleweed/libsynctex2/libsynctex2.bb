SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "libsynctex2-1.21-93.2.aarch64.rpm"
RPM_HASH = "0b52a8deb1e08a64ff79309b50a315b4586368f138d916d69117bf5c1c217e9afc637a19ea93d32d25199195dc041833b917e4b2ea5811dbf7921f4aef91d0e6"

RPROVIDES:${PN} += "libsynctex.so.2 \
libsynctex2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
