SUMMARY = "A time zone compiler for Java"
DESCRIPTION = "This is a time zone compiler for opensource Java Virtual Machine \
derived from openjdk6 source code."
LICENSE = "GPL-2.0-with-classpath-exception"

PV = "1.7.0"

RPM_NAME = "javazic-1.7.0-1.6.noarch.rpm"
RPM_HASH = "e279292c3949e3318a7c05e916bf64037a7c1bb069ed602d19ad013da8a59c9fd06c07fa6cbf75b85bf2d0da22362eef606df9ee8a26da8b3bf3e0cfd6a2f1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javazic"
RDEPENDS:${PN} += ""

inherit rpm
