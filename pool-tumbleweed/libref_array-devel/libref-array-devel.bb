SUMMARY = "Development files for libref_array"
DESCRIPTION = "A dynamically-growing, reference-counted array"
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "libref_array-devel-0.1.5-27.18.aarch64.rpm"
RPM_HASH = "09d6a440aed2767519f100cb78bb0d26c4f8354cd661eca3ecad3ff7178c29e7ff509f4a94eb7f37766a55e6268ebb309244482351c14a2268a9f580f631719e"

RPROVIDES:${PN} += "libref_array-devel \
libref_array-devel(aarch-64) \
pkgconfig(ref_array)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libref_array1"

inherit rpm
