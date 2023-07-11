SUMMARY = "Check your test requirements against the available version of Git"
DESCRIPTION = "Test::Requires::Git checks if the version of Git available for testing \
meets the given requirements. If the checks fail, then all tests will be \
_skipped_. \
 \
'use Test::Requires::Git' always calls 'test_requires_git' with the given \
arguments. If you don't want 'test_requires_git' to be called at import \
time, write this instead: \
 \
    use Test::Requires::Git -nocheck; \
 \
Passing the 'git' parameter (see test_requires_git below) to 'use \
Test::Requires::Git' will override it for the rest of the program run."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.008"

RPM_NAME = "perl-Test-Requires-Git-1.008-1.16.noarch.rpm"
RPM_HASH = "986134c5bb6a456ca22ea76b202fd6e79380409f65d92be968636c46ef25fbb6e2bb8a6bca9ddff67b1ba07911f29706a8660be58442fc691a57d9a4d8a07290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Requires--Git \
perl-Test-Requires-Git"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Git--Version--Compare"

inherit rpm
