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

RPM_NAME = "python39-jellyfish-0.8.2-1.18.aarch64.rpm"
RPM_HASH = "7e0beda89761038dc0f58c0aed7a6270a6c906cd4f3d521d1f44e0551caadf1c675f5539241203fc3680b7fbdc86622020bf2063cedf442dbe5ce79057f3641d"

RPROVIDES:${PN} += "python3.9dist-jellyfish \
python39-jellyfish \
python3dist-jellyfish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
