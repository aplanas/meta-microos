SUMMARY = "Development files for NUnit"
DESCRIPTION = "This package contains development files for NUnit integration."
LICENSE = "Zlib"

PV = "2.6.4"

RPM_NAME = "nunit-devel-2.6.4-4.19.aarch64.rpm"
RPM_HASH = "c95fe73854ed399c0e04d2e637766e39db59dfcd7022ad9ae0ee71b0665ea5991fee1df20ff6c68d81851430905db96d8fbf0e885eac13a3304f43c98ad510fd"

RPROVIDES:${PN} += "mono-nunit-devel \
nunit-devel \
pkgconfig-mono-nunit \
pkgconfig-nunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
nunit"

inherit rpm
