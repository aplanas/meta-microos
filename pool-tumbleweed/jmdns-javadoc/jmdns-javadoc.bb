SUMMARY = "API documentation for jmdns"
DESCRIPTION = "API documentation for jmdns."
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "jmdns-javadoc-3.5.7-2.10.noarch.rpm"
RPM_HASH = "925c2c1c946976f92f223992e23b503c3ff8d6e22aa198b1fbfdf3f6378f5095edcf620d8d22008db6b8afb117f6a8acde74aa629e980395f487138b8a1dac23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmdns-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
