SUMMARY = "Development libraries for nss-shared-helper"
DESCRIPTION = "Header and library files for helpers meant to enable sharing of NSS \
crypto database."
LICENSE = "LGPL-2.1+"

PV = "1.0.10"

RPM_NAME = "nss-shared-helper-devel-1.0.10-9.26.aarch64.rpm"
RPM_HASH = "603bad1c2284b0122bf57efed8c65be44af434d844001a92988eddcc9f53142e322a3ea6f208f48524fa886db921fd121c438cf4add2f37829c581ed3742202b"

RPROVIDES:${PN} += "nss-shared-helper-devel \
pkgconfig-nss-shared-helper"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnsssharedhelper0 \
mozilla-nss-devel \
pkgconfig-nss"

inherit rpm
