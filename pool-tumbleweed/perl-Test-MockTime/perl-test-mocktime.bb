SUMMARY = "Replaces actual time with simulated time"
DESCRIPTION = "This module was created to enable test suites to test code at specific \
points in time. Specifically it overrides localtime, gmtime and time at \
compile time and then relies on the user supplying a mock time via \
set_relative_time, set_absolute_time or set_fixed_time to alter future \
calls to gmtime,time or localtime."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Test-MockTime-0.17-1.18.noarch.rpm"
RPM_HASH = "113004822bd3d9eee852be4c1a6dd755727bd4d4ab4b9fa01f9987ef1c55a343e092add5efe6ec3144571c0e4bd5f2b790418424b2eb0336ac3769cd65328da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockTime \
perl-Test-MockTime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Time--Piece"

inherit rpm
