SUMMARY = "Javadoc for plexus-ant-factory"
DESCRIPTION = "Javadoc for plexus-ant-factory."
LICENSE = "Apache-2.0"

PV = "1.0~a2.1"

RPM_NAME = "plexus-ant-factory-javadoc-1.0~a2.1-2.7.noarch.rpm"
RPM_HASH = "87811b847239971fa34d7932f50790f0e11ffa1645f242e9ef80e0aacd16ff3286b2a1511b0906c419a7d24745901151e3c1e2bca0619ef27632581249505561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-ant-factory-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
