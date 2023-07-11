SUMMARY = "API documentation for netty3"
DESCRIPTION = "API documentation for netty3."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "3.10.6"

RPM_NAME = "netty3-javadoc-3.10.6-14.11.noarch.rpm"
RPM_HASH = "9ba9897c90b2882c015d2f3150dcdbd6e67bdc2db8e079aa973b78934d699d510cab81604ce09a0a5b731963ea4ffa901a80b7ad79bcb15d064a8fa721fac919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netty3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
