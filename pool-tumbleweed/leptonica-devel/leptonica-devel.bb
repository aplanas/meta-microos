SUMMARY = "Leptonica Development Files"
DESCRIPTION = "Development files for the Leptonica library."
LICENSE = "BSD-2-Clause"

PV = "1.83.1"

RPM_NAME = "leptonica-devel-1.83.1-1.3.aarch64.rpm"
RPM_HASH = "6c46a24217ae11240b1e7eb78420dd27cd38407e36975b38998be3d2c50cd2ac8ba8699008dc0bc5538ce05890c38218e6e502f368fe00ef5d34cc900e1537fc"

RPROVIDES:${PN} += "leptonica-devel \
leptonica-devel(aarch-64) \
liblept-devel \
libleptonica-devel \
pkgconfig(lept)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libleptonica6"

inherit rpm
