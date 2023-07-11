SUMMARY = "Reading/Writing of Complete Files with Character Encoding Support"
DESCRIPTION = "This module wraps the File::Slurp manpage and adds character encoding \
support through the *'encoding'* parameter. It exports the same functions \
which take all the same parameters as File::Slurp. Please see the the \
File::Slurp manpage documentation for basic usage; only the differences are \
described from here on out."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.7.1"

RPM_NAME = "perl-File-Slurp-Unicode-0.7.1-12.25.noarch.rpm"
RPM_HASH = "d81710074ae4a9e9664e238309e83003b38d30e7ae1b3722f18640a495972fe5f1278e5f6d95cb8445de1ccea3d9dbbf9c98cf308efb4c08b08772d070602f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp--Unicode \
perl-File-Slurp-Unicode"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Slurp"

inherit rpm
