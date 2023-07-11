SUMMARY = "Javadoc for morfologik-stemming"
DESCRIPTION = "This package contains javadoc for morfologik-stemming."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "morfologik-stemming-javadoc-2.1.9-1.2.noarch.rpm"
RPM_HASH = "913f8ee60580e24225c00db798701cb8896a11267c763a66040d51c9bccc7607583399fba50fc1a0088ad3a178e4048e630a2c96eec7fe638b0bccc7023bbfb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "morfologik-stemming-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
