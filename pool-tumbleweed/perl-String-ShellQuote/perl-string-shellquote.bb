SUMMARY = "Quote strings for passing through the shell"
DESCRIPTION = "This module contains some functions which are useful for quoting strings \
which are going to pass through the shell or a shell-like object."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.04"

RPM_NAME = "perl-String-ShellQuote-1.04-6.18.noarch.rpm"
RPM_HASH = "e8f3a59bd55e96cf9db9f8d8d2f0e1daf01952e10d5d66d69de66a0a0a0fc8b0e5ff6dc11634f0798ab15e2e4475999db7017940b4eb7db2be4517feb933b894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(String::ShellQuote) \
perl-String-ShellQuote"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
