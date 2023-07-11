SUMMARY = "Intelligently generate a README file from POD"
DESCRIPTION = "This module filters POD to generate a _README_ file, by using POD commands \
to specify which parts are included or excluded from the _README_ file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.2.3"

RPM_NAME = "perl-Pod-Readme-1.2.3-1.16.noarch.rpm"
RPM_HASH = "fdcd8ef0d60edcaac2553cfd59f7d0d667dd27947384b34cdd42ddf388d946345a9b7ecbf75dcc8b0a0226ea5e1e378ca5baec5ddd45f88d6652ac1a3826fa76"
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
perl--MODULE-COMPAT-5.36.1 \
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
