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

RPM_NAME = "perl-Test-Mock-Time-0.2.0-1.1.noarch.rpm"
RPM_HASH = "ae462074421e694257719c02685d890eb65d5e4ddcd9b504421ac5adebb9ced132dfc769afdfede8bba76a36295cfcbcc007b459fc59a1bac27b4be97c97ab32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--Time \
perl-Test-Mock-Time"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Export--Attrs \
perl-List--Util \
perl-Test--MockModule"

inherit rpm
