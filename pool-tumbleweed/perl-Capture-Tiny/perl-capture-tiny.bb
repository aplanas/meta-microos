SUMMARY = "Capture STDOUT and STDERR from Perl, XS or external programs"
DESCRIPTION = "Capture::Tiny provides a simple, portable way to capture almost anything \
sent to STDOUT or STDERR, regardless of whether it comes from Perl, from XS \
code or from an external program. Optionally, output can be teed so that it \
is captured while being passed through to the original filehandles. Yes, it \
even works on Windows (usually). Stop guessing which of a dozen capturing \
modules to use in any particular situation and just use this one."
LICENSE = "Apache-2.0"

PV = "0.48"

RPM_NAME = "perl-Capture-Tiny-0.48-1.17.noarch.rpm"
RPM_HASH = "3b63e979cc1006a9d70f063c3eb354d81e1b6086e021d202311a9dcbbeb955e576314d9ac61b9ca351ba48939810007cea0b5bb4a608f0944b4ad2db33f18041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Capture--Tiny \
perl-Capture-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
