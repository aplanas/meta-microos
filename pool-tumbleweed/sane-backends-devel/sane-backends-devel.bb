SUMMARY = "Development files for sane-backends"
DESCRIPTION = "This package contains the development files for sane-backends."
LICENSE = "GPL-2.0-or-later & SUSE-GPL-2.0+-with-sane-exception & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "sane-backends-devel-1.2.1-1.2.aarch64.rpm"
RPM_HASH = "e4b356f01ecfc515d3501bef6c28323ba76fb495fc305669cc3d44bb0343b321d4d33814a2f268af348a8d54e4a57e4461c74f36648367f45816789cf89002a4"

RPROVIDES:${PN} += "pkgconfig-sane-backends \
sane-backends-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libsane1"

inherit rpm
