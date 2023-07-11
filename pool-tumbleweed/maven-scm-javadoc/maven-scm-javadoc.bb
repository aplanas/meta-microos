SUMMARY = "Javadoc for maven-scm"
DESCRIPTION = "Javadoc for maven-scm."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "maven-scm-javadoc-1.12.0-3.4.noarch.rpm"
RPM_HASH = "10f84692f0d8bd1bcf27fdd8ca6e083a5be5fa362328db76636ea345dcd7534fd225b5f126f3a8e81dad3e34085bd2bc16ccc4409239befce6516a29a0929a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-scm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
