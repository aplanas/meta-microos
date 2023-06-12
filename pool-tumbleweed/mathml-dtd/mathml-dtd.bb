SUMMARY = "MathML DTD"
DESCRIPTION = "Contains the DTD 'Mathematical Markup Language' (MathML) Version 2.0, \
W3C Recommendation 21 February 2001."
LICENSE = "BSD-3-Clause"

PV = "20031021"

RPM_NAME = "mathml-dtd-20031021-225.16.noarch.rpm"
RPM_HASH = "f470c68a4c675fe171132e38593a736673166b0e9b58a3a4b1356cefe3349e8ed99662d1c92db2a4bdd01dd0d1a0ffdc6a4a5a59ce629ce12c1d6024f75fef20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mathml-dtd) \
mathml-dtd"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/edit-xml-catalog \
/usr/bin/sgml-register-catalog \
/usr/bin/xmlcatalog \
awk \
grep \
libxml2 \
sed \
sgml-skel"

inherit rpm
