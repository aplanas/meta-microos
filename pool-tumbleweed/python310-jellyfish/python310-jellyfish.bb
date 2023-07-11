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

RPM_NAME = "python310-jellyfish-0.8.2-1.18.aarch64.rpm"
RPM_HASH = "e2f8529973d656fbead82c9e092c015cf13c2051e02bef506d1d167522a73d201ec6520170ed0f9776556fb03dbfe1cd2e9b596cc59ddbf94880560ab93916fb"

RPROVIDES:${PN} += "python3.10dist-jellyfish \
python310-jellyfish \
python3dist-jellyfish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
