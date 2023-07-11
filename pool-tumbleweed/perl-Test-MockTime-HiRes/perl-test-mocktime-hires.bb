SUMMARY = "Replaces actual time with simulated high resolution time"
DESCRIPTION = "'Test::MockTime::HiRes' is a Time::HiRes compatible version of \
Test::MockTime. You can wait milliseconds in simulated time. \
 \
It also provides 'mock_time' to restrict the effect of the simulation in a \
code block."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-Test-MockTime-HiRes-0.08-1.2.noarch.rpm"
RPM_HASH = "091ef1e709beac2a94648efc03514746b8c2dd85fc7ccdd4687076dd5ecaf3926f98960584eddc62f4db654438bbd75afbaba57c2cb39f795e913d474358cab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockTime--HiRes \
perl-Test-MockTime-HiRes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--MockTime"

inherit rpm
