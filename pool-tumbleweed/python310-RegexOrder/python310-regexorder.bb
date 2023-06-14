SUMMARY = "Python module to search a regex that fits all query strings"
DESCRIPTION = "A module to search the regex that fits all query strings. \
 \
- Dozens of pre-written regexes are indexed and organized as a partial order, available in `regexorder/templates.json`. \
- The regex of all the querying strings' least upper bound in the partial order is returned. \
- templates.svg plots the partial order."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python310-RegexOrder-0.2-4.13.noarch.rpm"
RPM_HASH = "6d0f341737d3307f32ebc6e5a3c1b1a00d3a6ef016f1bb0ec1588956401402eb106d736f0a1bbff90375606c69a1a194abaaf124ce85589de14ce10d700ba629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-RegexOrder \
python3.10dist-regexorder \
python310-RegexOrder \
python3dist-regexorder"

RDEPENDS:${PN} += "python-abi \
python310-regex"

inherit rpm
