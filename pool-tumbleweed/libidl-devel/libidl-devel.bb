SUMMARY = "Development files for the IDL parsing library"
DESCRIPTION = "LibIDL is a small library for creating parse trees of CORBA v2.2 \
compliant Interface Definition Language (IDL) files, which is a \
specification for defining interfaces which can be used between \
different CORBA implementations."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.14"

RPM_NAME = "libidl-devel-0.8.14-23.24.aarch64.rpm"
RPM_HASH = "6a44e373baf2e9d7a6cc0df20447be6a3562777e444558f8540d2416ecbdf381d820971354ecd244944c602b90f36c1c52a3bf337ff13f0344a8a99b121ffa53"

RPROVIDES:${PN} += "libidl-devel \
libidl-devel(aarch-64) \
pkgconfig(libIDL-2.0)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libIDL-2-0 \
pkgconfig(glib-2.0)"

inherit rpm
