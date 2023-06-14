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

RPM_NAME = "perl-Lingua-Stem-It-0.02-1.26.noarch.rpm"
RPM_HASH = "0d40f4380279880362212a35713ce7eba582166d2834ff23aff3644aaca2e7e8863f029aef9b66d6da98ed51d3548f6b0f11da1d61d8e47909ad1643b92538f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--It \
perl-Lingua-Stem-It"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
