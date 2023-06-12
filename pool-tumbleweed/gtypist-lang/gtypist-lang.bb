SUMMARY = "Language files for package gtypist"
DESCRIPTION = "GNU Typist (typist) is a universal typing tutor. You can learn \
correct typing and improve your skills by practising its exercises on \
a regular basis. \
 \
This subpackage contain the translations for the package gtypist."
LICENSE = "GPL-3.0-only"

PV = "2.9.5"

RPM_NAME = "gtypist-lang-2.9.5-3.10.aarch64.rpm"
RPM_HASH = "63ce1390a4b0e0e09c27ee1421ae6049a4db359b5582a211cba4fb9ad15e2682b90b988ed4bf387cce7d74eb3a902ec49a1fde08cd9bcf9a0167e8b1dcd7c3ca"

RPROVIDES:${PN} += "gtypist-lang \
gtypist-lang(aarch-64) \
locale(gtypist:cs) \
locale(gtypist:de) \
locale(gtypist:es) \
locale(gtypist:eu) \
locale(gtypist:fi) \
locale(gtypist:fr) \
locale(gtypist:nl) \
locale(gtypist:pl) \
locale(gtypist:ru) \
locale(gtypist:tr) \
locale(gtypist:zh_CN) \
locale(gtypist:zh_TW)"
RDEPENDS:${PN} += "gtypist"

inherit rpm
