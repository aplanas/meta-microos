SUMMARY = "Guess file type"
DESCRIPTION = "checktype_filename(), checktype_filehandle() and checktype_contents returns \
string contains file type with MIME mediatype format."
LICENSE = "Apache-1.0"

PV = "1.30"

RPM_NAME = "perl-File-MMagic-1.30-5.28.noarch.rpm"
RPM_HASH = "55bec4766e5d82c159afc817095957403e0c002acd23d65e4aa341241a651909afbc78e9d66f67141a596bae8a822d2b1e80db9a5c75730aa1485430f8f6690d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--MMagic \
perl-File-MMagic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
