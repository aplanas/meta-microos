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

RPM_NAME = "perl-PHP-Serialization-0.34-13.27.noarch.rpm"
RPM_HASH = "bf7bfab17efa256ca4a816c35ca97712aa51b122d5b0bce2ddc375182a96ef449df0f18535612deb24ca72bd82cdd6888bbfae2413aa0cfe3fde063e8c1383fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PHP--Serialization \
perl-PHP--Serialization--Object \
perl-PHP-Serialization"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
