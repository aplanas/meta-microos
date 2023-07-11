SUMMARY = "Perl Xs Interface for a Portable Traditional"
DESCRIPTION = "This module implements the DES-based Unix _crypt_ function. For those who \
need to construct non-standard variants of _crypt_, the various building \
blocks used in _crypt_ are also supplied separately."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Crypt-UnixCrypt_XS-0.11-1.33.aarch64.rpm"
RPM_HASH = "1425595ccea70a1fddf1da64b39ebf33b29248f43b4b049c799074f6c093b5ee2cf158cd010476d51b14dd958ebd5403d261acc0c530a856a54903c079269f1f"

RPROVIDES:${PN} += "perl-Crypt--UnixCrypt-XS \
perl-Crypt-UnixCrypt-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
