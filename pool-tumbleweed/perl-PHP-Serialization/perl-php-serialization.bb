SUMMARY = "De-/serialize() PHP output into Perl"
DESCRIPTION = "Provides a simple, quick means of serializing perl memory structures \
(including object data!) into a format that PHP can deserialize() and \
access, and vice versa. \
 \
NOTE: Converts PHP arrays into Perl Arrays when the PHP array used \
exclusively numeric indexes, and into Perl Hashes then the PHP array did \
not."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.34"

RPM_NAME = "perl-PHP-Serialization-0.34-13.28.noarch.rpm"
RPM_HASH = "121c4cad1f284dde7b63ab28848329bab1710a52b6819c11f083761673466e33d1ff6decb8be95fc8ebcf6caed829b1e8f80f6caa6c83e984bb53e1e02ccb65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PHP--Serialization \
perl-PHP--Serialization--Object \
perl-PHP-Serialization"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
