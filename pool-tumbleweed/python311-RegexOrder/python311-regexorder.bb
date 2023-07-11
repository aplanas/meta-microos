SUMMARY = "Python module to search a regex that fits all query strings"
DESCRIPTION = "A module to search the regex that fits all query strings. \
 \
- Dozens of pre-written regexes are indexed and organized as a partial order, available in `regexorder/templates.json`. \
- The regex of all the querying strings' least upper bound in the partial order is returned. \
- templates.svg plots the partial order."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python311-RegexOrder-0.2-4.15.noarch.rpm"
RPM_HASH = "1340af6a24a6fda1deeb6002ba80b3dd6caf07b83e1db4b9c58f042cf7134b9434755e71273d47e94a5895d774cda8a0e99667895eaa85c9ae771f3105fe35ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-RegexOrder \
python3.11dist-regexorder \
python311-RegexOrder \
python3dist-regexorder"

RDEPENDS:${PN} += "python-abi \
python311-regex"

inherit rpm
