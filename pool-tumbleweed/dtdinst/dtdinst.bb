SUMMARY = "XML DTD to XML instance format converter"
DESCRIPTION = "DTDinst is a program for converting XML DTDs into an XML instance format."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "dtdinst-20220510-4.1.noarch.rpm"
RPM_HASH = "06a31ad8e523c3e6e0b0400911807bc40f080e7b239e49e442d931322759dcd8c2cb439a2baf054d54d10ea2462f3ac7491cab4d77ec436d1dd0bcb2944fb791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtdinst \
mvn-org.relaxng-dtdinst"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
jpackage-utils"

inherit rpm
