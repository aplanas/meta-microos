SUMMARY = "Javadoc for xsom"
DESCRIPTION = "This package contains javadoc for xsom."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "0~20140925"

RPM_NAME = "xsom-javadoc-0~20140925-4.5.noarch.rpm"
RPM_HASH = "e6679937b9446a64abf21ffb202dda2ed1aa7979aeb0ef011f2f68ff6fe925e811174d69599dadbb4578229137e491ed6c9673475fb338552952c51aa136073a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xsom-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
