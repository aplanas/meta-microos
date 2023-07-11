SUMMARY = "Capture STDOUT and STDERR from Perl, XS or external programs"
DESCRIPTION = "Capture::Tiny provides a simple, portable way to capture almost anything \
sent to STDOUT or STDERR, regardless of whether it comes from Perl, from XS \
code or from an external program. Optionally, output can be teed so that it \
is captured while being passed through to the original filehandles. Yes, it \
even works on Windows (usually). Stop guessing which of a dozen capturing \
modules to use in any particular situation and just use this one."
LICENSE = "Apache-2.0"

PV = "0.48"

RPM_NAME = "perl-Capture-Tiny-0.48-1.18.noarch.rpm"
RPM_HASH = "8e8225a6e709fecb48a5e24143f0fbdc57e7691cc3d432499c0b41667dad5feb3218775df422b7efbac5dae3a33c729f40223c9d1e73d08329c40f92c73a639c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Capture--Tiny \
perl-Capture-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
