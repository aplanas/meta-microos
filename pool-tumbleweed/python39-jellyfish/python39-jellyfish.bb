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

RPM_NAME = "python39-jellyfish-0.8.2-1.16.aarch64.rpm"
RPM_HASH = "4ac155bac9b119736b9c51ca7444cc448e4b253d1a3d32105cec3e1b991a63b939c6341c207dbf4b189893c373f4ee552ee5f12bdbba9321c0f1514a1c9b23c8"

RPROVIDES:${PN} += "python3.9dist(jellyfish) \
python39-jellyfish \
python39-jellyfish(aarch-64) \
python3dist(jellyfish)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
