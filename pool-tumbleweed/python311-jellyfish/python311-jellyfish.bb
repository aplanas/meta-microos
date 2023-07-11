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

RPM_NAME = "python311-jellyfish-0.8.2-1.18.aarch64.rpm"
RPM_HASH = "0d1a1ab9cc4376ac02c6730a351900306964f5e282d6a0600da43c8427754bc0fb1f5f8a2092246167616ea7aea92c0701313efdccb1025ba024a56a80043408"

RPROVIDES:${PN} += "python3-jellyfish \
python3.11dist-jellyfish \
python311-jellyfish \
python3dist-jellyfish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
