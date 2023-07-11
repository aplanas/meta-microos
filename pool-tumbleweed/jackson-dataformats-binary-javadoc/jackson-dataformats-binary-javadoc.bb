SUMMARY = "Javadoc for jackson-dataformats-binary"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-binary."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.13.3"

RPM_NAME = "jackson-dataformats-binary-javadoc-2.13.3-1.8.noarch.rpm"
RPM_HASH = "5fb7f3ae71abc64827e224117c8601ec530f7db65f420a2690b71ec479e71e9b2f225622068c88858b1e5b1f0c0c5b1055f96662dd6ab5882be9660c9b20496a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
