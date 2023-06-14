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

RPM_NAME = "perl-Test-Time-0.092-1.4.noarch.rpm"
RPM_HASH = "e552f21afef166a567cb097598d0fdffe6f79dc8658f3586d3168aceef5bf0fa4dba92e3f79582a51eb7c4d86aa47f358c607c2d0d26f5d00f97c6399e354172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Time \
perl-Test-Time"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
