SUMMARY = "Intelligently generate a README file from POD"
DESCRIPTION = "This module filters POD to generate a _README_ file, by using POD commands \
to specify which parts are included or excluded from the _README_ file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.2.3"

RPM_NAME = "perl-Pod-Readme-1.2.3-1.17.noarch.rpm"
RPM_HASH = "b241ddb7a98a3fccfbecb7cff9b5bd932b6824908b1903aee8b8c64db9bca2590adc6532ba7810a75009267825341c4c1defb9950c3c95f61c242b495341dace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Readme \
perl-Pod--Readme--Filter \
perl-Pod--Readme--Plugin \
perl-Pod--Readme--Plugin--changes \
perl-Pod--Readme--Plugin--requires \
perl-Pod--Readme--Plugin--version \
perl-Pod--Readme--Types \
perl-Pod-Readme"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Changes \
perl-CPAN--Meta \
perl-Class--Method--Modifiers \
perl-File--Slurp \
perl-Getopt--Long--Descriptive \
perl-List--Util \
perl-Module--CoreList \
perl-Moo \
perl-Moo--Role \
perl-MooX--HandlesVia \
perl-Path--Tiny \
perl-Pod--Simple \
perl-Role--Tiny \
perl-Try--Tiny \
perl-Type--Tiny \
perl-Types--Standard \
perl-namespace--autoclean"

inherit rpm
