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

RPM_NAME = "perl-Lingua-Stem-It-0.02-1.28.noarch.rpm"
RPM_HASH = "8f8d456ba8353629f60d64e9f05391298357bce0d7a1cbfc256dec87e52605e7e68bc5ecf6ad2bd2c85fa846f170736ebc4b6cc127b3a317ff01b84b99ff6898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--It \
perl-Lingua-Stem-It"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
