SUMMARY = "API documentation for janino"
DESCRIPTION = "API documentation for janino."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "janino-javadoc-3.1.6-1.11.noarch.rpm"
RPM_HASH = "34231caf218941211c20147262d799c092664b5ea9a61882976bab38b35f077ec2f2cf3c3027c136b41bc7126bd0a36465eeb67773f7e12e397862770216d8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "janino-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
