SUMMARY = "Transliterates text between writing systems"
DESCRIPTION = "Lingua::Translit can be used to convert text from one writing system to \
another, based on national or international transliteration tables. Where \
possible a reverse transliteration is supported. \
 \
The term 'transliteration' describes the conversion of text from one \
writing system or alphabet to another one. The conversion is ideally \
unique, mapping one character to exactly one character, so the original \
spelling can be reconstructed. Practically this is not always the case and \
one single letter of the original alphabet can be transcribed as two, three \
or even more letters. \
 \
Furthermore there is more than one transliteration scheme for one writing \
system. Therefore it is an important and necessary information, which \
scheme will be or has been used to transliterate a text, to work \
integrative and be able to reconstruct the original data. \
 \
Reconstruction is a problem though for non-unique transliterations, if no \
language specific knowledge is available as the resulting clusters of \
letters may be ambiguous. For example, the Greek character 'PSI' maps to \
'ps', but 'ps' could also result from the sequence 'PI', 'SIGMA' since 'PI' \
maps to 'p' and 'SIGMA' maps to s. If a transliteration table leads to \
ambiguous conversions, the provided table cannot be used reverse. \
 \
Otherwise the table can be used in both directions, if appreciated. So if \
ISO 9 is originally created to convert Cyrillic letters to the Latin \
alphabet, the reverse transliteration will transform Latin letters to \
Cyrillic."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.29"

RPM_NAME = "perl-Lingua-Translit-0.29-1.5.noarch.rpm"
RPM_HASH = "c7e5b17cde9a72a4a3a750e3aa5ca527e858f7e9c09e27f612afd4157e2440fdce8f964c6c4073a1039e17275be32639bc4ef12f25ff11083bd893321508a283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Translit \
perl-Lingua--Translit--Tables \
perl-Lingua-Translit"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
