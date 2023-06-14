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

RPM_NAME = "perl-Lingua-PT-Stemmer-0.02-1.25.noarch.rpm"
RPM_HASH = "d3a3cf48be50bc7cbeb4437e444bf3d5c52dae9cee3cca9244e554737ca38172b7b07cdc919de347759469f055f4f93fbe86f9f2680cfd420776b14c35c612d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--GL--Stemmer \
perl-Lingua--PT--Stemmer \
perl-Lingua-PT-Stemmer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
