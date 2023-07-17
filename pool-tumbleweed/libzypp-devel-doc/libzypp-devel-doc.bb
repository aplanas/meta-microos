SUMMARY = "Developer documentation for libzypp"
DESCRIPTION = "Developer documentation for libzypp."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.15"

RPM_NAME = "libzypp-devel-doc-17.31.15-1.3.aarch64.rpm"
RPM_HASH = "0a47e800a6bd8218fcf3e7dadc2e003f0e599a71b6696e7e72b1f6a8c693f8879249c266d2c28d9688804b813273de9707c3fed8ed490613b9eb94ccfb7889af"

RPROVIDES:${PN} += "libzypp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
