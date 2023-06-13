SUMMARY = "Replaces actual time with simulated high resolution time"
DESCRIPTION = "'Test::MockTime::HiRes' is a Time::HiRes compatible version of \
Test::MockTime. You can wait milliseconds in simulated time. \
 \
It also provides 'mock_time' to restrict the effect of the simulation in a \
code block."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-Test-MockTime-HiRes-0.08-1.1.noarch.rpm"
RPM_HASH = "a892c43307af576ca7f757278920d8dc2971ea8b24f6180ddd9df841a5b41aa09915dcdb5095dddf5f7a9efc99fac6405bec4c5b1a8fdbfa2b156a72b89ef5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::MockTime::HiRes) \
perl-Test-MockTime-HiRes"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::MockTime)"

inherit rpm
