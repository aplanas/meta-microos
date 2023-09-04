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

RPM_NAME = "perl-Lingua-Stem-Ru-0.04-1.26.noarch.rpm"
RPM_HASH = "6a6fdee0dccb30d5c83d7f0c6a1cb2faf8cb09b5eebc7ad7150562aa39f097afb469f8da7dd8b334127789d17443b670505bfbb4e3a5a2b8a8723c116ee9ad43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Ru \
perl-Lingua-Stem-Ru"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
