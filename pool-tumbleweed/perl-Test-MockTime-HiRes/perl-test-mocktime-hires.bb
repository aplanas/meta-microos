SUMMARY = "Replaces actual time with simulated high resolution time"
DESCRIPTION = "'Test::MockTime::HiRes' is a Time::HiRes compatible version of \
Test::MockTime. You can wait milliseconds in simulated time. \
 \
It also provides 'mock_time' to restrict the effect of the simulation in a \
code block."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-Test-MockTime-HiRes-0.08-1.3.noarch.rpm"
RPM_HASH = "042afd99783fb3f6ce121feb3d916245a78dad28d02e0c6c3cf4da4d19138fcdd65b2c24a7f6a78fc961aee848f6dccc20bc5daf38beb482bbe6479caa75c74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockTime--HiRes \
perl-Test-MockTime-HiRes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--MockTime"

inherit rpm
