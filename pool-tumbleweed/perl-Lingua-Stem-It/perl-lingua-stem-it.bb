SUMMARY = "Porter's stemming algorithm for Italian"
DESCRIPTION = "This module applies the Porter Stemming Algorithm to its parameters, \
returning the stemmed words. \
 \
The algorithm is implemented exactly (I hope :-) as described in: \
 \
    http://snowball.tartarus.org/algorithms/italian/stemmer.html \
 \
The code is carefully crafted to work in conjunction with the the \
Lingua::Stem manpage module by Benjamin Franz, from which I've also \
borrowed some functionalities (caching and exception list)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Lingua-Stem-It-0.02-1.27.noarch.rpm"
RPM_HASH = "9e30f8294e96e114d0a98260e1e38171b6b9a68ddbfea12ede14504d193cc9aa3074e20afb21e83929c1b1e1cc46ff65bdf41301de2545ec9857b67f4aabbc51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--It \
perl-Lingua-Stem-It"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
