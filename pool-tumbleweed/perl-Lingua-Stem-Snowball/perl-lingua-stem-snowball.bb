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

RPM_NAME = "perl-Lingua-Stem-Snowball-0.952-14.36.aarch64.rpm"
RPM_HASH = "d3d3897cad1f0560156e6211b4c026c158db3c76ad94b4fe1bc81c99dbaa006b576bdebc96c6bfd76e818f7fa3a2c8ca673e85265222793350b6be534834beb3"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball \
perl-Lingua-Stem-Snowball"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
