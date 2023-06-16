SUMMARY = "TEI 4 DTD (SGML and XML)"
DESCRIPTION = "If you want to mark up literary and linguistic texts for online \
research or for printing, the DTD of the TEI (Text Encoding Initiative) \
is the way to go. The TEI DTD comes with special markup elements and \
attributes for poems, plays, and novels as well as for critical \
apparatus, taxonomy systems, etc. \
 \
 \
 \
Authors: \
-------- \
    C M Sperberg-McQueen \
    Lou Burnard \
    Syd Bauman \
    Steven DeRose \
    Sebastian Rahtz"
LICENSE = "BSD-3-Clause"

PV = "2006.8.14"

RPM_NAME = "tei_4-2006.8.14-19.16.noarch.rpm"
RPM_HASH = "8c003d0fb642c50ec13637686110fa4f86297598084176872831ac64f94d296b88a94bf1e2d316e718c3ba04544873936496cf4f0c0b020cbc10145df17d7c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tei-4 \
tei-4"

RDEPENDS:${PN} += "/usr/bin/edit-xml-catalog \
/usr/bin/install \
/usr/bin/sgml-register-catalog \
/usr/bin/sh \
/usr/bin/touch \
/usr/bin/xmlcatalog \
awk \
grep \
iso-ent \
libxml2 \
sed \
sgml-skel \
xmlcharent \
zlib"

inherit rpm
