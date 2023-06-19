SUMMARY = "Javadoc for xsom"
DESCRIPTION = "This package contains javadoc for xsom."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "0~20140925"

RPM_NAME = "xsom-javadoc-0~20140925-4.4.noarch.rpm"
RPM_HASH = "21a0285f14e64057bbad880eb9d42baf78f4cba25ebdfe3109c51cfaf637c83068e371eb70f64459b04cadc78d58c0ecf415668501ea263ea2b67c5dd5fd2e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xsom-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
