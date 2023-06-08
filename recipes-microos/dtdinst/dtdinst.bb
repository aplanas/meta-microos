SUMMARY = "XML DTD to XML instance format converter"
DESCRIPTION = "DTDinst is a program for converting XML DTDs into an XML instance format."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "dtdinst-20220510-3.1.noarch.rpm"
RPM_HASH = "04f816753ad3d13f810460c34519468c5ddcb316225a2c249c872565ada39d88b9cec04be2ce326f58a0cb1a7222b9506ac808dd2fd35e8bf046b366cdc0cc1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtdinst mvn(org.relaxng:dtdinst)"
RDEPENDS:${PN} += "/bin/bash java-headless javapackages-filesystem jpackage-utils"

inherit rpm
