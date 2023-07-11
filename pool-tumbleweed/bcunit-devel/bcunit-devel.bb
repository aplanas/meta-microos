SUMMARY = "BCUnit development files"
DESCRIPTION = "BCUnit is a unit testing framework for C. \
This package installs the BCUnit development files."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.2+git.20191119"

RPM_NAME = "bcunit-devel-3.0.2+git.20191119-1.14.aarch64.rpm"
RPM_HASH = "7767d1821ae08cfac6b885c7cb8a52d8e182bcb5a8af0597c09c1b82da1c3f2cf695fe8472e9abdff32372f8662240970adc9a7c1d2d8987e4ae5815fc882d78"

RPROVIDES:${PN} += "bcunit-devel \
pkgconfig-bcunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcunit1 \
ncurses-devel"

inherit rpm
