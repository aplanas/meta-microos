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

RPM_NAME = "perl-Data-Hexdumper-3.0001-1.3.noarch.rpm"
RPM_HASH = "82b2e9ff6963475b6840da46442f6c4a861a7d6b2a79f84f2b9b0c5aa035d559b34b35ff60748065e4420bcabf13bda7ccd252affdd4ace51c41200f3f61eb9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Hexdumper \
perl-Data-Hexdumper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--More"

inherit rpm
