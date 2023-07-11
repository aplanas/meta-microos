SUMMARY = "XSLT Processor Written in Java"
DESCRIPTION = "AdaptX is an extensible stylesheet language (XSL) processor."
LICENSE = "BSD-3-Clause"

PV = "0.9.13"

RPM_NAME = "adaptx-0.9.13-136.7.noarch.rpm"
RPM_HASH = "a0f9a18aeee93d18a541c48e17078dc8383d166e146d1546386685edfc7a029499cdcd9b75259dd53e3c4e01a5f9c0da4e2645c6e552a2c1942b42ae61e815c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptx"

RDEPENDS:${PN} += "reload4j \
xerces-j2 \
xml-apis"

inherit rpm
