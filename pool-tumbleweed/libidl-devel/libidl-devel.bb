SUMMARY = "Development files for the IDL parsing library"
DESCRIPTION = "LibIDL is a small library for creating parse trees of CORBA v2.2 \
compliant Interface Definition Language (IDL) files, which is a \
specification for defining interfaces which can be used between \
different CORBA implementations."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.14"

RPM_NAME = "libidl-devel-0.8.14-23.25.aarch64.rpm"
RPM_HASH = "08d92b9f9dc98878e36fad65a2d073ae46a103c18c0a9e852667258cad4cff17905d4129c30d0f249b93efc5e2482397bac4799c512ba41cf31607ff034e94cd"

RPROVIDES:${PN} += "libidl-devel \
pkgconfig-libIDL-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libIDL-2-0 \
pkgconfig-glib-2.0"

inherit rpm
