SUMMARY = "Javadoc for jackson-dataformats-text"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-text."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformats-text-javadoc-2.13.3-1.8.noarch.rpm"
RPM_HASH = "b54076811135e4bb0a69de38910f531609e532afb894501950f51ee4b30234dc34fd82893cdd542c29fa7287de47bfa9c720b1c867476a3879db55c8098b3675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
