SUMMARY = "Etrophy development files"
DESCRIPTION = "Headers and other files used for development using etrophy"
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "etrophy-devel-0.5.1-8.30.aarch64.rpm"
RPM_HASH = "246753e42dba96c88565400db0eaa241a3078285e2a05c30f05d24eb23b06a08928e63f3847b9c3b84878e2ba914135975774020c8b5c83313e93894dffc33fb"

RPROVIDES:${PN} += "etrophy-devel \
etrophy-devel(aarch-64) \
pkgconfig(etrophy)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
efl-devel \
elementary-devel \
etrophy-data \
libetrophy0 \
pkgconfig(ecore) \
pkgconfig(ecore-file) \
pkgconfig(eet) \
pkgconfig(eina) \
pkgconfig(elementary) \
pkgconfig(evas)"

inherit rpm
