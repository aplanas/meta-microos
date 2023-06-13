SUMMARY = "Utilities to inspect Windows Hibernation Files"
DESCRIPTION = "This subpackage provides the utilities from libhibr, which allows for \
inspecting Windows Hibernation Files (hiberfil.sys)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libhibr-tools-20210421-3.5.aarch64.rpm"
RPM_HASH = "e34fd6110248efe6a46d927f073451a0f25dcf3fb6aeabf41f50c99c3e7bd2f28b5aee4015e9b30451c1ab0291f0c34e8c00ba2448c17b6615c32df095b24582"

RPROVIDES:${PN} += "libhibr-tools \
libhibr-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.2)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libhibr.so.1()(64bit) \
libhibr.so.1(V_20210421)(64bit)"

inherit rpm
