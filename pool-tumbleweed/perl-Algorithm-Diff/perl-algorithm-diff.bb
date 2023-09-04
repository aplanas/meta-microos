SUMMARY = "Compute `intelligent' differences between two files / lists"
DESCRIPTION = "Compute `intelligent' differences between two files / lists"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.201"

RPM_NAME = "perl-Algorithm-Diff-1.201-1.13.noarch.rpm"
RPM_HASH = "416147ed5cb2fb074a7473778e3641b9f1e02557f21d1a4adaaa0d46cae78fc07cdc653e412d60e812143902867d7dadafb198a37bb6b4fc971772563b2c5cee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--Diff \
perl-Algorithm--Diff---impl \
perl-Algorithm-Diff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
