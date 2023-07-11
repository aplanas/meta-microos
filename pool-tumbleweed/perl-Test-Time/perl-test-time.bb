SUMMARY = "Overrides the time() and sleep() core functions for testing"
DESCRIPTION = "Test::Time can be used to test modules that deal with time. Once you 'use' \
this module, all references to 'time', 'localtime' and 'sleep' will be \
internalized. You can set custom time by passing time => number after the \
'use' statement: \
 \
    use Test::Time time => 1; \
 \
    my $now = time;    # $now is equal to 1 \
    sleep 300;         # returns immediately, displaying a note \
    my $then = time;   # $then equals to 301"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.092"

RPM_NAME = "perl-Test-Time-0.092-1.5.noarch.rpm"
RPM_HASH = "52cdaed00a33039bc6ea592a9f8c8864b4595f6a036abab836577480f22957a29b69fe9a75b2f57cd77f2bcbfdf6b02fd9db2a6187751462de424b2d078fea15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Time \
perl-Test-Time"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
