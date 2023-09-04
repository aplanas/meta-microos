SUMMARY = "Capture STDOUT and STDERR from Perl, XS or external programs"
DESCRIPTION = "Capture::Tiny provides a simple, portable way to capture almost anything \
sent to STDOUT or STDERR, regardless of whether it comes from Perl, from XS \
code or from an external program. Optionally, output can be teed so that it \
is captured while being passed through to the original filehandles. Yes, it \
even works on Windows (usually). Stop guessing which of a dozen capturing \
modules to use in any particular situation and just use this one."
LICENSE = "Apache-2.0"

PV = "0.48"

RPM_NAME = "perl-Capture-Tiny-0.48-1.19.noarch.rpm"
RPM_HASH = "0cd2ee6ffb69b7bfbe90a3c1427e27408869d0a1cf5554cc4208c9129a1042088754a1eb3a86e8a2be9a3cda60eb3093eb75aa40fe3b810541aff3eb58f32f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Capture--Tiny \
perl-Capture-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
