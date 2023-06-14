SUMMARY = "Libraries and include files for developing with R-base"
DESCRIPTION = "This package provides the necessary development headers and \
libraries to allow you to devel with R-base."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-devel-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "05096342dae83d77fe30d19654957f420d63abb4346f898a7d1085d41aefe628dd372f71969c89fa7d2e75fc1c3814e14c68af7ffb9ccd55cde76eae18f088d4"

RPROVIDES:${PN} += "R-core-devel \
R-devel \
R-devel-macros \
config-R-core-devel \
pkgconfig-libR \
rpm-macro-R-archlib \
rpm-macro-R-install \
rpm-macro-R-noarchlib \
rpm-macro-R-rpmver \
rpm-macro-R-test \
rpm-macro-R-unpack \
rpm-macro-R-version"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
R-base"

inherit rpm
