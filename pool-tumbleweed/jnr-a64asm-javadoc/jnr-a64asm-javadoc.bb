SUMMARY = "Javadocs for jnr-a64asm"
DESCRIPTION = "This package contains the API documentation for jnr-a64asm."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jnr-a64asm-javadoc-1.0.0-2.2.noarch.rpm"
RPM_HASH = "54f2ae75d587a9b778c5d878052ddd31a8384715bf31ad551e1d8daf8839f49ca0708853f6691730b2f938839b4248741d501217993ac9c5c352fcce070bece8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-a64asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
