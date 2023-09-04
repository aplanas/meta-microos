SUMMARY = "Backslash escapes, quoted phrase, word elision, etc."
DESCRIPTION = "sorry, no description found"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "2010.002"

RPM_NAME = "perl-String-Escape-2010.002-14.29.noarch.rpm"
RPM_HASH = "a5ea5e6c0ef1a306d02831abeaaac156c9e685e54088def0fe9a453eac198b3b0def26701be380ff16d8d7f580da3629e7775ef822e00e76979948f21333a7a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Escape \
perl-String-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
