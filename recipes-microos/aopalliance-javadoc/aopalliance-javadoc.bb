SUMMARY = "API documentation for aopalliance"
DESCRIPTION = "This package contains the API documentation for aopalliance."
LICENSE = "SUSE-Public-Domain"

PV = "1.0"

RPM_NAME = "aopalliance-javadoc-1.0-2.5.noarch.rpm"
RPM_HASH = "68e24a3d82db1282a1cf8889f4f95c2057a34b0fe886f5b45ac23f8fa83173444e081bd67a69d47bc3809cd4fa8b429fb8bca094e9d0f96bf3b46431ecf0f41e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aopalliance-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
