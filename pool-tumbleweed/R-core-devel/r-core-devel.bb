SUMMARY = "Libraries and include files for developing with R-base"
DESCRIPTION = "This package provides the necessary development headers and \
libraries to allow you to devel with R-base."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-core-devel-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "2f191e9cdc46ea71ecacd28137e4c730e544b7911c3628e9f5b5e82729f2eecb94e20cfc0f7023973d2754f984db720556b61b9d1012aa60265e2211af00cbde"

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
