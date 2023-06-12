SUMMARY = "Slide WebDAV client"
DESCRIPTION = "Slide includes a fully featured WebDAV client library and command line \
client."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "jakarta-slide-webdavclient-javadoc-2.1-27.9.noarch.rpm"
RPM_HASH = "159a8b34db4f4e70b363edf855eb13535007a444dd61a478df80580b01a12c12f5e258a23a7a6582b8ac3e0f9b08c2388fcfa11a0766c5975d4c1510c0b1b38f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-slide-webdavclient-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
