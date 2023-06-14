SUMMARY = "Test for warnings and the lack of them"
DESCRIPTION = "If you've ever tried to use Test::NoWarnings to confirm there are no \
warnings generated by your tests, combined with the convenience of \
'done_testing' to not have to declare a test count, you'll have discovered \
that these two features do not play well together, as the test count will \
be calculated _before_ the warnings test is run, resulting in a TAP error. \
(See 'examples/test_nowarnings.pl' in this distribution for a \
demonstration.) \
 \
This module is intended to be used as a drop-in replacement for \
Test::NoWarnings: it also adds an extra test, but runs this test _before_ \
'done_testing' calculates the test count, rather than after. It does this \
by hooking into 'done_testing' as well as via an 'END' block. You can \
declare a plan, or not, and things will still Just Work. \
 \
It is actually equivalent to: \
 \
    use Test::NoWarnings 1.04 ':early'; \
 \
as warnings are still printed normally as they occur. You are safe, and \
enthusiastically encouraged, to perform a global search-replace of the \
above with 'use Test::Warnings;' whether or not your tests have a plan. \
 \
It can also be used as a replacement for Test::Warn, if you wish to test \
the content of expected warnings; read on to find out how."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.031"

RPM_NAME = "perl-Test-Warnings-0.031-1.9.noarch.rpm"
RPM_HASH = "a9bde5e965cdce38c7966d3afa6b5b2b167877420b8c9db8cd91f10550c2936060167b5ca92da4c94121990a1cfbe60ea4c83f48062706e1df88880ef0896118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Warnings \
perl-Test-Warnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-parent"

inherit rpm
