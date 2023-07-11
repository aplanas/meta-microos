SUMMARY = "Javadoc for jctools"
DESCRIPTION = "This package contains javadoc for jctools."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-javadoc-3.3.0-2.11.noarch.rpm"
RPM_HASH = "a414fc562bbc8b875a5da0962e3f3ab8d7b38a265b2379d453d29ba1c26eec9d97a287a1d5f242dac6651f006482e8fc7d6603c461d94049730303ed511c8004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
