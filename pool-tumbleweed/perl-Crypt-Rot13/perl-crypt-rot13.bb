SUMMARY = "Rot13 (Caesar) encryption for perl"
DESCRIPTION = "This package provides ROT13 Algorithm (Caesar) as a Perl module."
LICENSE = "GPL-2.0+"

PV = "0.6"

RPM_NAME = "perl-Crypt-Rot13-0.6-22.26.noarch.rpm"
RPM_HASH = "64a64b0a236903a06e7d419c5a3ca2353216d53cb4917d973ae5da559ecfaf33d5665d161215e3e6ef408cf00aaeba4d1d569143d8f4648a8c01b88770665b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--Rot13 \
perl-Crypt-Rot13"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
