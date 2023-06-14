SUMMARY = "Python module to search a regex that fits all query strings"
DESCRIPTION = "A module to search the regex that fits all query strings. \
 \
- Dozens of pre-written regexes are indexed and organized as a partial order, available in `regexorder/templates.json`. \
- The regex of all the querying strings' least upper bound in the partial order is returned. \
- templates.svg plots the partial order."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python39-RegexOrder-0.2-4.13.noarch.rpm"
RPM_HASH = "ad356abdbb36b7278892f173c8055d86b681bac9cf56cd9f91194752a404fdbd0db7d1f15cfed9fc7a87008f54a20aed372db60401719488721489dd057a4653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-regexorder \
python39-RegexOrder \
python3dist-regexorder"

RDEPENDS:${PN} += "python-abi \
python39-regex"

inherit rpm
