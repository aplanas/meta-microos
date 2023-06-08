SUMMARY = "Additional utilities related to libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides tools based on libfolks, like an importer for Pidgin \
metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "folks-tools-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "a53e237e12f0580d9f866ee2a94dd3105995734e52dc30288c8dd785992bc222f072893f143dcd0d18a74622b841ec485e881c52a90b88b83ab9d42095afc558"

RPROVIDES:${PN} += "folks-tools folks-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libreadline.so.8()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
