SUMMARY = "Alias for __PACKAGE__"
DESCRIPTION = "CLASS and $CLASS are both synonyms for __PACKAGE__. Easier to type. \
 \
$CLASS has the additional benefit of working in strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1.7"

RPM_NAME = "perl-CLASS-1.1.7-1.8.noarch.rpm"
RPM_HASH = "38d8a1dedff5d1c52e1bb82b4370aad8985cb4c45351825ece3c9d194cc91914b5186679d5587c9ea315c63b5524404901b644b64f2f65c2e09cf14dff0cef3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CLASS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
