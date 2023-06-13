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

RPM_NAME = "perl-Test-Requires-Git-1.008-1.15.noarch.rpm"
RPM_HASH = "925a299b576c2b74b30a210a5aa809b5f8a7d85c54fe2522dd7019e28e34da53290b5b315d8dbde4250d27d04774b4874c2ce36dcd00c10c55fd9c621ca3469c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Requires::Git) \
perl-Test-Requires-Git"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Git::Version::Compare)"

inherit rpm
