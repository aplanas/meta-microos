SUMMARY = "Deterministic time & timers for event loop tests"
DESCRIPTION = "This module replaces actual time with simulated time everywhere (core \
time(), Time::HiRes, EV, AnyEvent with EV, Mojolicious, …) and provide a \
way to write deterministic tests for event loop based applications with \
timers. \
 \
*IMPORTANT!* This module *must* be loaded by your script/app/test before \
other related modules (Time::HiRes, Mojolicious, EV, etc.)."
LICENSE = "MIT"

PV = "0.1.7"

RPM_NAME = "perl-Test-Mock-Time-0.1.7-1.18.noarch.rpm"
RPM_HASH = "c6ac8be2ec172f2c038be943dd1badc66f1608e65e1814bd887d69fbdadca90a3723abff0667b0e47111b32b1c15de094ac85ee24033d6c9d59f744c6a2feaef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--Time \
perl-Test-Mock-Time"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Export--Attrs \
perl-List--Util \
perl-Test--MockModule"

inherit rpm
