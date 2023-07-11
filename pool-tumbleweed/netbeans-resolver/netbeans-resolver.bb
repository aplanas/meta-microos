SUMMARY = "Resolver subproject of xml-commons patched for NetBeans"
DESCRIPTION = "Resolver subproject of xml-commons, version 1.2 with \
a patch for NetBeans."
LICENSE = "Apache-1.1"

PV = "6.7.1"

RPM_NAME = "netbeans-resolver-6.7.1-19.20.noarch.rpm"
RPM_HASH = "b9350439ccea61d8b287b8c49c1ec8fb24fbe3e842e0f8ee00debe3936f54a07d5ede6b46cf2b7638f4de9d0ab4e00b0b8b2e81c396aa75a5e2b2010842cdf0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbeans-resolver"

RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
