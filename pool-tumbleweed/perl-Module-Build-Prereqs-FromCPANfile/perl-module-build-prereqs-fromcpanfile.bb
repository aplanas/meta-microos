SUMMARY = "Construct prereq parameters of Module::Build from cpanfile"
DESCRIPTION = "This simple module reads cpanfile and converts its content into valid \
prereq parameters for 'new()' method of Module::Build. \
 \
Currently it does not support 'optional features' specification (See \
cpanfile/feature)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-Module-Build-Prereqs-FromCPANfile-0.02-1.12.noarch.rpm"
RPM_HASH = "a837a37487b96ef9623e591340214e8f2c13968357034ee8f508ba40990401903a21f7f27b4bb7f42198f271b2db9db61b962b043ee08f1e1099ae450f4033ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Prereqs--FromCPANfile \
perl-Module-Build-Prereqs-FromCPANfile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta--Prereqs \
perl-Module--CPANfile \
perl-version"

inherit rpm
