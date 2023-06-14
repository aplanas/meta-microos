SUMMARY = "Python module to search a regex that fits all query strings"
DESCRIPTION = "A module to search the regex that fits all query strings. \
 \
- Dozens of pre-written regexes are indexed and organized as a partial order, available in `regexorder/templates.json`. \
- The regex of all the querying strings' least upper bound in the partial order is returned. \
- templates.svg plots the partial order."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python311-RegexOrder-0.2-4.13.noarch.rpm"
RPM_HASH = "8525269653f187f8b417661fcf1865c07d9ac104e7137a7beacf89db0f2fc464abd5049354f86e70321182fe272fa4233922b35ff9ae5fd7617242f00e9f8d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-regexorder \
python311-RegexOrder \
python3dist-regexorder"

RDEPENDS:${PN} += "python-abi \
python311-regex"

inherit rpm
