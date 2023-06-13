SUMMARY = "Javadoc for eclipse-anyedit"
DESCRIPTION = "Developer documentation for eclipse-anyedit."
LICENSE = "EPL-1.0"

PV = "2.7.1"

RPM_NAME = "eclipse-anyedit-javadoc-2.7.1-2.7.noarch.rpm"
RPM_HASH = "ddc591e07c126eefda62b0c1b0982773feb1a148a0ba3ffa289e713fe90c303276d6857615aad4837674325a8fddf1675cd79c00a00769cd5ea8c44146229640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-anyedit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
