SUMMARY = "Reading/Writing of Complete Files with Character Encoding Support"
DESCRIPTION = "This module wraps the File::Slurp manpage and adds character encoding \
support through the *'encoding'* parameter. It exports the same functions \
which take all the same parameters as File::Slurp. Please see the the \
File::Slurp manpage documentation for basic usage; only the differences are \
described from here on out."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.7.1"

RPM_NAME = "perl-File-Slurp-Unicode-0.7.1-12.26.noarch.rpm"
RPM_HASH = "3fab77ed76825c63c99f1a3f1e10a3fd845018f39d64881e6fbcb4460fe262b2df73548a11eb4f644a9799a2adc52051aefd1e3c14bf1e710767e47b0628639c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp--Unicode \
perl-File-Slurp-Unicode"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Slurp"

inherit rpm
