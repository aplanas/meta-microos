SUMMARY = "Javadoc for mybatis"
DESCRIPTION = "This package contains javadoc for mybatis."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "mybatis-javadoc-3.5.6-6.3.noarch.rpm"
RPM_HASH = "6148cb323a037857145a635bdfacb636a5bf95ed9ca7f6051eb20f87f7c0212d799752d4fbb86edbf8e6fce7bc8236054854090215b79fe6464336553fe24520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mybatis-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
