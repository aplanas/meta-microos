SUMMARY = "Javadoc for jackson-dataformats-binary"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-binary."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.15.2"

RPM_NAME = "jackson-dataformats-binary-javadoc-2.15.2-2.1.noarch.rpm"
RPM_HASH = "46aeee65e736524bf9e1965b1195017d35b259ba12073ce208bc4b7a4c6fe321026e71652c899d0f9f0f5fd0e6d945a4ad93d14ac79586ca8bafb0a83c19e5f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
