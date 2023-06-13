SUMMARY = "Javadoc for test-interface"
DESCRIPTION = "Javadoc for test-interface."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "test-interface-javadoc-1.0-2.5.noarch.rpm"
RPM_HASH = "ae62f420d35c15c0ddf271d08c8083aa33e0d1e5484ce4a0d2462143e35cad5caac4e467cdca376c92c57eeaef7867ef92f3e8353c2ec8da430211cc77459848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "test-interface-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
