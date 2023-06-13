SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "libsynctex2-1.21-91.1.aarch64.rpm"
RPM_HASH = "7d3aea5ea268f8de2a35a68b89ffc3c5bdc80a34498e3b007b0baac6bea6c7856fc1208872295742e8cc3dec5f61eb532b19db70a6ca173fe27fa6fbc369914e"

RPROVIDES:${PN} += "libsynctex.so.2()(64bit) \
libsynctex2 \
libsynctex2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libz.so.1()(64bit)"

inherit rpm
