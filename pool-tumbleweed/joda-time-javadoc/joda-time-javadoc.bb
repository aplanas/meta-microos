SUMMARY = "Javadocs for joda-time"
DESCRIPTION = "This package contains the API documentation for joda-time."
LICENSE = "Apache-2.0"

PV = "2.10.1"

RPM_NAME = "joda-time-javadoc-2.10.1-2.6.noarch.rpm"
RPM_HASH = "69027a092838a2164027b23ac6697821a993c1bd49de1f9a231ebbd96183339b3c9a865aed49900b44d15ea9e73b8d520b3fc6de4db4a57f6c3cb5a09adde529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-time-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
