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

RPM_NAME = "perl-Lingua-Stem-Ru-0.04-1.24.noarch.rpm"
RPM_HASH = "0a20be221154504e63b1597e84fc2c43c27bcfe1c8601f3abc8924606804486f921627e60590bfcd8ae0f1b79ebaef1aa11bee7de2d87cb2542ec9ec2bdd2140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Ru \
perl-Lingua-Stem-Ru"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
