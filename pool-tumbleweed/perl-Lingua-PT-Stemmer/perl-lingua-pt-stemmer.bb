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

RPM_NAME = "perl-Lingua-PT-Stemmer-0.02-1.26.noarch.rpm"
RPM_HASH = "62ae4e811f7a23c6ed2b87a55a8603a05cdf1f570efaae4f57940e73a9af10fbfaadeea011ffa70d0cf9266df897592f8c911f9a45aef367379d1ea40ddef343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--GL--Stemmer \
perl-Lingua--PT--Stemmer \
perl-Lingua-PT-Stemmer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
