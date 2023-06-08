SUMMARY = "XSLT Processor Written in Java"
DESCRIPTION = "AdaptX is an extensible stylesheet language (XSL) processor."
LICENSE = "BSD-3-Clause"

PV = "0.9.13"

RPM_NAME = "adaptx-0.9.13-136.6.noarch.rpm"
RPM_HASH = "97ce51bb6a0430b2798e4e4c9825c83bd248adbdc7a3145c86876ca37336a2a109520a3255725b082e28475d7e5b7623aa7d498861b431639343ce54701039e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptx"
RDEPENDS:${PN} += "reload4j xerces-j2 xml-apis"

inherit rpm
