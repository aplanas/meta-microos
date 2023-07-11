SUMMARY = "Developer documentation for libzypp"
DESCRIPTION = "Developer documentation for libzypp."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.15"

RPM_NAME = "libzypp-devel-doc-17.31.15-1.2.aarch64.rpm"
RPM_HASH = "04ff4e7c0fb3ae73741b45a0c8fb3fdb31ce03d6066b190d6ef2da6e7f59584e8448466cc6185c07986efe597d1144850cdfa6b6b0ebb2f1d4f73b373d37cf62"

RPROVIDES:${PN} += "libzypp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
