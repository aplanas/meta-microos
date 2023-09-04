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

RPM_NAME = "perl-Test-Time-0.092-1.6.noarch.rpm"
RPM_HASH = "ea9c485f3727368403b3c684a11ccad5dcef601299bc961c29d3f38a602d46ff77138f8350155c4733454f3123db93baa5d381f30625294fefadbd40420b5c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Time \
perl-Test-Time"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
