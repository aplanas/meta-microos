SUMMARY = "Portuguese language stemming"
DESCRIPTION = "This module implements a Portuguese stemming algorithm proposed in the \
paper *A Stemming Algorithm for the Portuguese Language* by *Moreira, V.* \
and *Huyck, C.* \
 \
The eight steps of stemming algorithm are listed as follows: \
 \
* * Plural Reduction \
 \
* * Feminine Reduction \
 \
* * Adverb Reduction \
 \
* * Augmentative/Diminutive Reduction \
 \
* * Noun Suffix Reduction \
 \
* * Verb Suffix Reduction \
 \
* * Vowel Reduction \
 \
* * Accents Removal"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-Lingua-PT-Stemmer-0.02-1.27.noarch.rpm"
RPM_HASH = "e16d650be4f41919c6ad3b1692addad5219d4659de6397f5830dd9ebe41a3de12af5deb56083bb3aa0d8999923e4a4fa3cfb0728124ee9414dbb3f4f968a2513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--GL--Stemmer \
perl-Lingua--PT--Stemmer \
perl-Lingua-PT-Stemmer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
