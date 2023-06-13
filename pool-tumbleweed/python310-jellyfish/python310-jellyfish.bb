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

RPM_NAME = "python310-jellyfish-0.8.2-1.16.aarch64.rpm"
RPM_HASH = "eb43c51ad4806b7945ccff2f5e7ed498028b97ecfcf15aab80b8d3b69ee639943919ddfbf35ab6ae9f51ae21c04fe70b20cf0610f84e12e03083a85a970bb6c4"

RPROVIDES:${PN} += "python3-jellyfish \
python3.10dist(jellyfish) \
python310-jellyfish \
python310-jellyfish(aarch-64) \
python3dist(jellyfish)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
