SUMMARY = "Perl Xs Interface for a Portable Traditional"
DESCRIPTION = "This module implements the DES-based Unix _crypt_ function. For those who \
need to construct non-standard variants of _crypt_, the various building \
blocks used in _crypt_ are also supplied separately."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Crypt-UnixCrypt_XS-0.11-1.34.aarch64.rpm"
RPM_HASH = "b0ee9e81c9f13c213e53b136e7513c5b966ee05523ea38e12607111b24ea035055f29afc58cacb9f22a011461173ceb54e25b8395d98d8786d11ee39306f44c1"

RPROVIDES:${PN} += "perl-Crypt--UnixCrypt-XS \
perl-Crypt-UnixCrypt-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
