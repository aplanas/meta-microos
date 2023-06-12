SUMMARY = "Javadoc for icu4j"
DESCRIPTION = "API documentation for icu4j."
LICENSE = "BSD-3-Clause & MIT & Unicode & SUSE-Public-Domain"

PV = "73.1"

RPM_NAME = "icu4j-javadoc-73.1-1.1.noarch.rpm"
RPM_HASH = "4df6ac633d754b699c5fcc8886e0df87579378c0a9426fa0b109d197ebf2fbfcde91d4d34cc3e4373064a24f622145ff11d40f46332c6f11b1e66f2aa599a08d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icu4j-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
