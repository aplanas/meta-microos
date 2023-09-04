SUMMARY = "Work with International Standard Music Numbers"
DESCRIPTION = "work with International Standard Music Numbers"
LICENSE = "Artistic-2.0"

PV = "1.203"

RPM_NAME = "perl-Business-ISMN-1.203-1.3.noarch.rpm"
RPM_HASH = "d05268c62581268dbb59be9392231ebe4a0c3c31ae9a2a8c5cb55cf17a7fdd271857473afc4df17a09f9d2e573e9dd7757ee1218ee426789f4af6928e9ac8c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISMN \
perl-Business--ISMN--Data \
perl-Business-ISMN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Tie--Cycle"

inherit rpm
