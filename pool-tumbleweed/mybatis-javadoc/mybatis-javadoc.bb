SUMMARY = "Javadoc for mybatis"
DESCRIPTION = "This package contains javadoc for mybatis."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "mybatis-javadoc-3.5.6-8.1.noarch.rpm"
RPM_HASH = "bc32dc4373d5a8ea4c90fb360226b8f7f99dcd365b184eacb106346d59fc18a46561ce2b1e9d9f4c6e428063cc5a0bc5f4d3a608a1f8a681e705d6ac9b711817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mybatis-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
