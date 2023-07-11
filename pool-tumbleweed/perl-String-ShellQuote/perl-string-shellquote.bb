SUMMARY = "Quote strings for passing through the shell"
DESCRIPTION = "This module contains some functions which are useful for quoting strings \
which are going to pass through the shell or a shell-like object."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.04"

RPM_NAME = "perl-String-ShellQuote-1.04-6.19.noarch.rpm"
RPM_HASH = "59fab7c192b5f6245b535badd0f78c522f8ca4cfb1033e3906c2a8ccab2f02d11b08c33c9e121900c75c17d4306ab41455bb338ec43da06593c2e53997cd89c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--ShellQuote \
perl-String-ShellQuote"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
