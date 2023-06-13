SUMMARY = "Full featured consistent hashing python library compatible with ketama"
DESCRIPTION = "Full featured consistent hashing python library compatible with ketama."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python39-uhashring-2.3-1.1.noarch.rpm"
RPM_HASH = "a68da4b29d62255933c80aba8dc707838f994fd1cb11b311f6adc5d52d63b3ef28082b91b00bc0ab83d3ee02ed7b68106ae1f585279fda95a622632478e8d199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(uhashring) \
python39-uhashring \
python3dist(uhashring)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
