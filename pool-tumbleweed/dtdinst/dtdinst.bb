SUMMARY = "XML DTD to XML instance format converter"
DESCRIPTION = "DTDinst is a program for converting XML DTDs into an XML instance format."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "dtdinst-20220510-3.2.noarch.rpm"
RPM_HASH = "4884b6473ddc6a406340a805b50f3317527c325e2d825cf538b0985db822d263e3a67ca7f5bd26b5419b2f538f897ae1b9a08304b17d602925dee8941576e67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtdinst \
mvn-org.relaxng-dtdinst"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
jpackage-utils"

inherit rpm
