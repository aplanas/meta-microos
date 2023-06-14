SUMMARY = "Backslash escapes, quoted phrase, word elision, etc."
DESCRIPTION = "sorry, no description found"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "2010.002"

RPM_NAME = "perl-String-Escape-2010.002-14.27.noarch.rpm"
RPM_HASH = "df9ac11831d147575b9c63c724b028ad9e4c596076cf2ad33aa624a7121741ea8ca1dcb52ea8402c42217b8e4b06d032189f9e382e74bc09a3283fd6249240ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Escape \
perl-String-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
