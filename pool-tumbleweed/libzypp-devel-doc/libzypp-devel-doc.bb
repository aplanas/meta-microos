SUMMARY = "Developer documentation for libzypp"
DESCRIPTION = "Developer documentation for libzypp."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.19"

RPM_NAME = "libzypp-devel-doc-17.31.19-1.2.aarch64.rpm"
RPM_HASH = "39be4896369113a5ca350697e2bf950a102175c66a80d1dc9088929789abafafb44477f26c21a5bca9d8631df95ce77c288d3f407128ba2866e1258e1749d618"

RPROVIDES:${PN} += "libzypp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
