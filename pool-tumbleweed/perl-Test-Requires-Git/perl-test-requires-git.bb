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

RPM_NAME = "perl-Test-Requires-Git-1.008-1.17.noarch.rpm"
RPM_HASH = "65d283c444a6efd10ce055f5b58f62852d7262b82dc1780218b773f0bb24caec19c8acbd86dd823047d694c0cc43b8348c3ff86744e76fd0877553f3759fbc6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Requires--Git \
perl-Test-Requires-Git"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Git--Version--Compare"

inherit rpm
