SUMMARY = "Deterministic time & timers for event loop tests"
DESCRIPTION = "This module replaces actual time with simulated time everywhere (core \
time(), Time::HiRes, EV, AnyEvent with EV, Mojolicious, …) and provide a \
way to write deterministic tests for event loop based applications with \
timers. \
 \
*IMPORTANT!* This module *must* be loaded by your script/app/test before \
other related modules (Time::HiRes, Mojolicious, EV, etc.)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "perl-Test-Mock-Time-0.2.0-1.2.noarch.rpm"
RPM_HASH = "53aa4b2a418732e50f222c6464e53011109dc868c6fe5479d5faae7cca9aa9b90291a2e4050c0db20f0679ee199c2962f1fcdb275d243866e85a9927150ad1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--Time \
perl-Test-Mock-Time"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Export--Attrs \
perl-List--Util \
perl-Test--MockModule"

inherit rpm
