SUMMARY = "Development files for sane-backends"
DESCRIPTION = "This package contains the development files for sane-backends."
LICENSE = "GPL-2.0-or-later & SUSE-GPL-2.0+-with-sane-exception & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "sane-backends-devel-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "a83b74dd2f9f7a355dc489ab35bd9a5d02a9b46a7c74532023f22806c65e81d65df159e4aca6a05dcc4ee3c0adbdda866f9ea1123dfbbd1abb2f83854e49a5a8"

RPROVIDES:${PN} += "pkgconfig(sane-backends) \
sane-backends-devel \
sane-backends-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libsane1"

inherit rpm
