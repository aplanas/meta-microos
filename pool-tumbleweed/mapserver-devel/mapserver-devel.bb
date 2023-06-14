SUMMARY = "Mapserver development files"
DESCRIPTION = "The Mapserver development package provides necessary files to build \
against the C Mapserver library."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "mapserver-devel-8.0.0-2.5.aarch64.rpm"
RPM_HASH = "78b68e69da700c8ebce9ed4e027bd23fffb432122dc64655cf12f388ffa4633f3888bab5c90b1bc680c12364473a515938dfbb44a88ea84add1003af7a7af832"

RPROVIDES:${PN} += "mapserver-devel"

RDEPENDS:${PN} += "libmapserver2"

inherit rpm
