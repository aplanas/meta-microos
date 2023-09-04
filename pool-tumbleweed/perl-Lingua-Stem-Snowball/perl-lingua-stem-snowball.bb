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

RPM_NAME = "perl-Lingua-Stem-Snowball-0.952-14.38.aarch64.rpm"
RPM_HASH = "4ac9a36d4551808c0547ced0b33f8c3b34265e54f09d437be9e9a56f762d122077d6f2ab8001eb8d3a2a8b24b154b5bbebd69293f51118c32dc2813837f97244"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball \
perl-Lingua-Stem-Snowball"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
