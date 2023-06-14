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

RPROVIDES:${PN} += "folks-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libreadline.so.8 \
libxml2.so.2"

inherit rpm
