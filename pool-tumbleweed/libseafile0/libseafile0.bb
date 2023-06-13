SUMMARY = "Library files for seafile"
DESCRIPTION = "The libseafile0 package contains libraries and header files for \
developing applications that use seafile."
LICENSE = "GPL-2.0-only"

PV = "9.0.1"

RPM_NAME = "libseafile0-9.0.1-1.1.aarch64.rpm"
RPM_HASH = "d2b35dcefef7b71251647f775174487ac13874e1594b05d62de391d68af0787c6518c332de64abe1beeb334307c7329af8c5ade90ba2e84d6d98650c6ef8b340"

RPROVIDES:${PN} += "libseafile.so.0()(64bit) \
libseafile0 \
libseafile0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsearpc.so.1()(64bit)"

inherit rpm
