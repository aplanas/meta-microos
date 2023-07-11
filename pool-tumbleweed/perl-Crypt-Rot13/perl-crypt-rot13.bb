SUMMARY = "Rot13 (Caesar) encryption for perl"
DESCRIPTION = "This package provides ROT13 Algorithm (Caesar) as a Perl module."
LICENSE = "GPL-2.0+"

PV = "0.6"

RPM_NAME = "perl-Crypt-Rot13-0.6-22.25.noarch.rpm"
RPM_HASH = "5914f2900b98c66651a18856524f4b7956f27b3bccae22e9f9db31b0f3bf58e07dddf5bd566735306f0ab8391b81d7237abce9564fe484c7f856912d4f790f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--Rot13 \
perl-Crypt-Rot13"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
