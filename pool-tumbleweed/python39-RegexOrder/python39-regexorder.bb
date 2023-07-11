SUMMARY = "Python module to search a regex that fits all query strings"
DESCRIPTION = "A module to search the regex that fits all query strings. \
 \
- Dozens of pre-written regexes are indexed and organized as a partial order, available in `regexorder/templates.json`. \
- The regex of all the querying strings' least upper bound in the partial order is returned. \
- templates.svg plots the partial order."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python39-RegexOrder-0.2-4.15.noarch.rpm"
RPM_HASH = "f357d00118e04861f159271fc78563e7ce61b5b6e05a546cffc1c654f6cfaeb59529e1e87cf187214a4384511c50f6769b8e46fb4e1f8529898af6d926c218df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-regexorder \
python39-RegexOrder \
python3dist-regexorder"

RDEPENDS:${PN} += "python-abi \
python39-regex"

inherit rpm
