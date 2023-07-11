SUMMARY = "Python module to search a regex that fits all query strings"
DESCRIPTION = "A module to search the regex that fits all query strings. \
 \
- Dozens of pre-written regexes are indexed and organized as a partial order, available in `regexorder/templates.json`. \
- The regex of all the querying strings' least upper bound in the partial order is returned. \
- templates.svg plots the partial order."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python310-RegexOrder-0.2-4.15.noarch.rpm"
RPM_HASH = "83470dab219b67116aa7ae2502d9cbd333e2483e46e88e32e56775f2dd4a73040b2374918fec33c951709f6e5e2399dc01489ff96f054a8caf3d9b02bab0d853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-regexorder \
python310-RegexOrder \
python3dist-regexorder"

RDEPENDS:${PN} += "python-abi \
python310-regex"

inherit rpm
