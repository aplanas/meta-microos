SUMMARY = "Backslash escapes, quoted phrase, word elision, etc."
DESCRIPTION = "sorry, no description found"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "2010.002"

RPM_NAME = "perl-String-Escape-2010.002-14.28.noarch.rpm"
RPM_HASH = "ba4a125a29454a758287f2121193c8f41e23a7de45f9f052b78a9f5647fbe4acf830cb87793a3a30a698e617191dffbc51729717d0d984df5ac49bc754840222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Escape \
perl-String-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
