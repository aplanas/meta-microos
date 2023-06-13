SUMMARY = "Javadoc for disruptor"
DESCRIPTION = "This package contains javadoc for disruptor."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "disruptor-javadoc-3.4.4-1.12.noarch.rpm"
RPM_HASH = "a4bb5ec325e4632141e69b75c54c1b81e581db345500495aa63babeb0b063cce285c2c68c6b5fcb224ec69f7e029459ce05e9723958725bdf1943b82ca1dcfa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "disruptor-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
