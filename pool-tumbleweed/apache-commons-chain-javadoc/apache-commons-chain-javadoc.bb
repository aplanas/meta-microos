SUMMARY = "Javadoc for apache-commons-chain"
DESCRIPTION = "This package contains javadoc for apache-commons-chain."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "apache-commons-chain-javadoc-1.2-2.6.noarch.rpm"
RPM_HASH = "0d13ea8d40cfb73caa5b34038bef79e9453ba8fd31ca4fe755666a3cf8a855bd770311507c56807f20c69efdb4fdd844d1ab3b8bb38d0b273c841d1becc96dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-chain-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
