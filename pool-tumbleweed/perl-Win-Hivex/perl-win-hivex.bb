SUMMARY = "Perl bindings for hivex"
DESCRIPTION = "This subpackage contains the Perl bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "perl-Win-Hivex-1.3.23-2.6.aarch64.rpm"
RPM_HASH = "8f0eb757a6ecafcbb588e0a74a06e93306c2d224817454066abbe090fa7aed4827a5fd7145b133cf3ab5945b686e3deb70889c02da7034766aad351b0f0fdddd"

RPROVIDES:${PN} += "perl-Win--Hivex \
perl-Win--Hivex--Regedit \
perl-Win-Hivex"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
