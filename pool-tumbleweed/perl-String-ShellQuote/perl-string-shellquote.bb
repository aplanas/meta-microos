SUMMARY = "Quote strings for passing through the shell"
DESCRIPTION = "This module contains some functions which are useful for quoting strings \
which are going to pass through the shell or a shell-like object."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.04"

RPM_NAME = "perl-String-ShellQuote-1.04-6.20.noarch.rpm"
RPM_HASH = "bbcb9c6723c4e53c311a32ee2432b05f64b1d9c006b3ad9599e44541183b671860d3046be8ba0907a220c3cac4189c3428fcb6332631baf1fbf46a2c5ae996d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--ShellQuote \
perl-String-ShellQuote"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
