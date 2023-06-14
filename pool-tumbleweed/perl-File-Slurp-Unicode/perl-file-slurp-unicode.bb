SUMMARY = "Reading/Writing of Complete Files with Character Encoding Support"
DESCRIPTION = "This module wraps the File::Slurp manpage and adds character encoding \
support through the *'encoding'* parameter. It exports the same functions \
which take all the same parameters as File::Slurp. Please see the the \
File::Slurp manpage documentation for basic usage; only the differences are \
described from here on out."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.7.1"

RPM_NAME = "perl-File-Slurp-Unicode-0.7.1-12.24.noarch.rpm"
RPM_HASH = "be8c121ad546c5abe8d5f6f382684287824a156910e4a9dfcd418c79e1d8e31cf7f24734c4fee5ddc86d1c07d2b06d281e0144b91761365e832d64696910a913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp--Unicode \
perl-File-Slurp-Unicode"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-File--Slurp"

inherit rpm
