SUMMARY = "Javadoc for tiger-types"
DESCRIPTION = "This package contains javadoc for tiger-types."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.2"

RPM_NAME = "tiger-types-javadoc-2.2-4.11.noarch.rpm"
RPM_HASH = "ddff9bb11eb3548ce71de94c3acf48bbedf91abd0dc35fd64997049532456748553ab5fec9823b06e2faf98beef657faa698aeb11d48394e77af35d5e04a3a06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiger-types-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
