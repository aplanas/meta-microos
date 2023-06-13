SUMMARY = "The OpenJade Group's SGML and XML Parsing Tools"
DESCRIPTION = "The tools in this package provide the ability to manage SGML and XML \
documents. \
 \
This package contains the parser nsgmls and the related programs \
sgmlnorm, spcat, spam, spent, and sgml2xml (previously known as sx). \
Sgml2xml is useful as a tool for converting from SGML to XML, the \
coming WWW standard. \
 \
This package is a fork from James Clark's SP suite."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "opensp-doc-1.5.2-202.1.noarch.rpm"
RPM_HASH = "0f65a812d6ef5328bc04e672621fa7c46e9d51af3d7ac36addea5c425691fc8fd0e3a5267c9e2a6f862066905b9878efe219642739762fad3cccc75e3a09cb22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenSP \
opensp-doc \
sp \
sp_libs"

RDEPENDS:${PN} += "/usr/bin/sgml-register-catalog"

inherit rpm
