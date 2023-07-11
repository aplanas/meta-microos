SUMMARY = "Porter's stemming algorithm for Russian (KOI8-R only)"
DESCRIPTION = "This module applies the Porter Stemming Algorithm to its parameters, \
returning the stemmed words. \
 \
The algorithm is implemented exactly as described in: \
 \
    http://snowball.tartarus.org/algorithms/russian/stemmer.html \
 \
The code is carefully crafted to work in conjunction with the Lingua::Stem \
module by Benjamin Franz. This stemmer is also based on the work of Aldo \
Capini, see Lingua::Stem::It."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Lingua-Stem-Ru-0.04-1.25.noarch.rpm"
RPM_HASH = "b6851c0d76766cc4adeb1c7b0abb787568d5dcb06bed67e53eeca623ee4fad9943692bde795317d501c09d321d29781380978457bd7db8693cc82dac6aa32f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Ru \
perl-Lingua-Stem-Ru"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
