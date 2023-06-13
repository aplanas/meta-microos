SUMMARY = "Elliptic Curve Data for the PARI CAS"
DESCRIPTION = "PARI/GP version of J. E. Cremona's Elliptic Curve Data, needed by \
the PARI functions 'ellsearch' and 'ellidentify'."
LICENSE = "GPL-2.0-or-later"

PV = "20210301"

RPM_NAME = "pari-elldata-20210301-1.6.noarch.rpm"
RPM_HASH = "1b1ee10f21ec2dd038bfad7f27653b76e246fc4a0638b4c8619448087ec77bab36dc029a4c2730ae9e7d9623379bed74ac80168bbd18a121a3f5a404b3490b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-elldata"

RDEPENDS:${PN} += ""

inherit rpm
