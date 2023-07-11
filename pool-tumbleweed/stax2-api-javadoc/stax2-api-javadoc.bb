SUMMARY = "API documentation for stax2-api"
DESCRIPTION = "This package contains the API documentation for stax2-api."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "stax2-api-javadoc-4.0.0-3.11.noarch.rpm"
RPM_HASH = "2e6e0f1728125ee6d1f8a4dbd8cd88fde6691acb9892ec541db939348199f67a487debdc349ae8235db1eccef423120a508cc2c6f4eed1029bb13b0e60a3757a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stax2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
