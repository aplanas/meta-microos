SUMMARY = "CFD General Notation System library"
DESCRIPTION = "The CFD General Notation System (CGNS) provides a general, portable, \
and extensible standard for the storage and retrieval of computational \
fluid dynamics (CFD) analysis data."
LICENSE = "Zlib"

PV = "4.3.0"

RPM_NAME = "libcgns4_3-4.3.0-1.8.aarch64.rpm"
RPM_HASH = "1aa648282b45871e47c33d1c48722a25b6e6c82dbe9b789b94233281ef1f231a316e978cc5be5d13b0c2061dcd860387963b3a02edbabc55baa72772ca086af6"

RPROVIDES:${PN} += "libcgns \
libcgns.so.4.3 \
libcgns4-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200"

inherit rpm
