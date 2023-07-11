SUMMARY = "Javadoc for jnacl"
DESCRIPTION = "This package contains API documentation for jnacl."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "jnacl-javadoc-1.0.0-1.8.noarch.rpm"
RPM_HASH = "5c25de5f60e5b859f29fbe0003ece57ea1f89632b0ffc274304ded813054b4f7be7fa0cd968376edfe33413b00e3cbd791ac99b1d556636599ad037c96408378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnacl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
