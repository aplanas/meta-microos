SUMMARY = "Perl interface to Snowball stemmers"
DESCRIPTION = "Stemming reduces related words to a common root form -- for instance, \
'horse', 'horses', and 'horsing' all become 'hors'. Most commonly, stemming \
is deployed as part of a search application, allowing searches for a given \
term to match documents which contain other forms of that term. \
 \
Authors: \
-------- \
    Oleg Bartunov, <oleg at sai dot msu dot su> \
    Teodor Sigaev, <teodor at stack dot net> \
    Marvin Humphrey <marvin at rectangular dot com>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.952"

RPM_NAME = "perl-Lingua-Stem-Snowball-0.952-14.37.aarch64.rpm"
RPM_HASH = "8b0269a0d1f3ce167181853e66edc10be05abe7ed4b9e7ddad0d78543e1ba10b5e5e9585c4257e5082aa202200f3de3568ffb53057071a9dc2db31eaa680a411"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball \
perl-Lingua-Stem-Snowball"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
