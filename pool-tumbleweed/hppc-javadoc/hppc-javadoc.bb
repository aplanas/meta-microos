SUMMARY = "Javadoc for HPPC"
DESCRIPTION = "This package contains javadoc for HPPC."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "hppc-javadoc-0.7.1-3.10.noarch.rpm"
RPM_HASH = "0c07cc4e060bd3c32cf8f94f5a78762d9a6f4087431df4cf35cceb5ce775e3eb9f66297b28a253e559d544c4e70448dc441ca5e5058a1014682538c79aa8abbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hppc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
