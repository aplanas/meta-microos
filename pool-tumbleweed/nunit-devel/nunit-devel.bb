SUMMARY = "Development files for NUnit"
DESCRIPTION = "This package contains development files for NUnit integration."
LICENSE = "Zlib"

PV = "2.6.4"

RPM_NAME = "nunit-devel-2.6.4-4.18.aarch64.rpm"
RPM_HASH = "ddfeb1326a8ab006c91f60dd4a8c0d1de8b18f5fd152e54567bf5e016a8ca82280c9201b62228dd4f684f239806939f70779fe8540271b46b3c783a930b68560"

RPROVIDES:${PN} += "mono-nunit-devel \
nunit-devel \
nunit-devel(aarch-64) \
pkgconfig(mono-nunit) \
pkgconfig(nunit)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
nunit"

inherit rpm
