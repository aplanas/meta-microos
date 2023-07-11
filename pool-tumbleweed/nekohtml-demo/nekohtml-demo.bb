SUMMARY = "Demo for nekohtml"
DESCRIPTION = "Demonstrations and samples for nekohtml."
LICENSE = "Apache-2.0"

PV = "1.9.22.noko2"

RPM_NAME = "nekohtml-demo-1.9.22.noko2-1.5.noarch.rpm"
RPM_HASH = "e7f843b835169e12761b76872c5b8ab6610de16e98915829fe9fffd7a89dab91104c489a1b872a3cce2392648470cf1323ae65ea450d97817363d87a03d2475c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sourceforge.nekohtml-nekohtml-samples \
nekohtml-demo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
nekohtml"

inherit rpm
