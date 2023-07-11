SUMMARY = "API documentation for rhino"
DESCRIPTION = "API documentation for rhino."
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-javadoc-1.7.14-2.5.noarch.rpm"
RPM_HASH = "e6ffe676f7bf4966107898d4539548005ff5ebb6d65e73be5047948212184bb0de022fd51a9c8f744d18a82ba74f76e03ba9cc4fa2e694a613df9feea357b586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rhino-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
