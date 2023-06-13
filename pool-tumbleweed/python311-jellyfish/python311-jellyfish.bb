SUMMARY = "A library for doing approximate and phonetic matching of strings"
DESCRIPTION = "Jellyfish is a python library for doing approximate and phonetic \
matching of strings. \
 \
Includes algorithms for string comparison: Levenshtein Distance, \
Damerau-Levenshtein Distance, Jaro Distance, Jaro-Winkler Distance, \
Match Rating Approach Comparison and Hamming Distance. \
 \
And algorithms for phonetic encoding: American Soundex, Metaphone, \
NYSIIS (New York State Identification and Intelligence System) and \
Match Rating Codex."
LICENSE = "BSD-2-Clause"

PV = "0.8.2"

RPM_NAME = "python311-jellyfish-0.8.2-1.16.aarch64.rpm"
RPM_HASH = "98cfa8b9181797eae5b7a1bd22ed01218e049e430a022aa4ee92ca3709f530dadd37f3dc3ba43d629d7047ec0cb26cf9beb6026d1443bb4a3730610076a64577"

RPROVIDES:${PN} += "python3.11dist(jellyfish) \
python311-jellyfish \
python311-jellyfish(aarch-64) \
python3dist(jellyfish)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
