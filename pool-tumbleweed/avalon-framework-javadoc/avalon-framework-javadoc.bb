SUMMARY = "Javadoc for avalon-framework"
DESCRIPTION = "API documentation for avalon-framework."
LICENSE = "Apache-2.0"

PV = "4.3"

RPM_NAME = "avalon-framework-javadoc-4.3-4.6.noarch.rpm"
RPM_HASH = "e7fe00a10fe8a8dae31b5e420bb792d1e790298cb8376570ed8862a96608a088eac2917f3237fe34fe8d90bf7bb0832bccc63224e6737625457384fc47353e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-framework-javadoc \
avalon-framework-manual"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
