SUMMARY = "DocBook Schemas (DTD, RELAX NG, W3C Schema) for Version 5.x"
DESCRIPTION = "DocBook is a schema. It is particularly well-suited to books and papers \
about computer hardware and software (though it is not limited to these \
applications at all). \
 \
Version 5 is a complete rewrite of DocBook in RELAX NG. \
The intent of this rewrite is to produce a schema that is true to the \
spirit of DocBook while simultaneously removing inconsistencies that \
have arisen as a natural consequence of DocBook's long, slow evolution."
LICENSE = "SUSE-Oasis-Specification-Notice"

PV = "5.2cr5"

RPM_NAME = "docbook_5-5.2cr5-2.1.noarch.rpm"
RPM_HASH = "a723c2184015e17a0e563ea13ab9ecb04d8b82a7076c767c5daca3d1e4fd99da5f426d08648476e4fbd3974e47e1a59fa6e9b119935724e60e72fea72389f3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-docbook-5 \
docbook-5"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
sgml-skel"

inherit rpm
