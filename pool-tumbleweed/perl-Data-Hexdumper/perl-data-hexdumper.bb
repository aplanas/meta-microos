SUMMARY = "Make binary data human-readable"
DESCRIPTION = "'Data::Hexdumper' provides a simple way to format arbitrary binary data \
into a nice human-readable format, somewhat similar to the Unix 'hexdump' \
utility. \
 \
It gives the programmer a considerable degree of flexibility in how the \
data is formatted, with sensible defaults. It is envisaged that it will \
primarily be of use for those wrestling alligators in the swamp of binary \
file formats, which is why it was written in the first place."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.0001"

RPM_NAME = "perl-Data-Hexdumper-3.0001-1.2.noarch.rpm"
RPM_HASH = "93597343d3197078a8f96a4ae80035570d4dde17cfcc9530feee04e373c917a76dddcbd76d191e3decc40d891728f8c62a96a1a58aa6ffab8d178055c00e09d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Hexdumper) \
perl-Data-Hexdumper"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::More)"

inherit rpm
