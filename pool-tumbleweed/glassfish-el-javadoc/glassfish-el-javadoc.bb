SUMMARY = "Javadoc for glassfish-el"
DESCRIPTION = "This package contains javadoc for glassfish-el."
LICENSE = "(CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0) & Apache-2.0"

PV = "3.0.1~b08"

RPM_NAME = "glassfish-el-javadoc-3.0.1~b08-1.18.noarch.rpm"
RPM_HASH = "835d3ec3fa3ffebe033f61308598037d0dee58938e60307dd91aaf815dafdc04ab3c4a1202d306f65fa3bbe841b085d7dbca0a9913e3dc219486ebceed360722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-el-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
