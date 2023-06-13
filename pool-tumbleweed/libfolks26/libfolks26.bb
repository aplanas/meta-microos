SUMMARY = "Library to create metacontacts from multiple sources"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "libfolks26-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "b329c4155e21f4c91059e44b4940adc3ee83e87c8953621cb123e54b73cfd02c1d69e21e59c982305a77411d411de55229cd0f96c1c3ab4c631df71d6fe97164"

RPROVIDES:${PN} += "folks \
libfolks-dummy.so.26()(64bit) \
libfolks.so.26()(64bit) \
libfolks26 \
libfolks26(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
folks-data \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libebook-contacts-1.2.so.4()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
