SUMMARY = "Retry $N Times"
DESCRIPTION = "Sub::Retry provides the function named 'retry'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Sub-Retry-0.06-1.17.noarch.rpm"
RPM_HASH = "59ca90bf904e977f78e0aab345a7ca7a6da732fcae3e46b9d1252f5b6e2c81879ba7ccc7bb5b28048aa159d975ff135cfd8402c0b1109a8bd99c7079e831812e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Retry \
perl-Sub-Retry"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
