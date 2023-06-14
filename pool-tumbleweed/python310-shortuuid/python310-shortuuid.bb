SUMMARY = "A generator library for concise, unambiguous and URL-safe UUIDs"
DESCRIPTION = "A library that generates short, pretty, unambiguous unique IDs \
by using an extensive, case-sensitive alphabet and omitting \
similar-looking letters and numbers."
LICENSE = "BSD-3-Clause"

PV = "1.0.11"

RPM_NAME = "python310-shortuuid-1.0.11-1.1.noarch.rpm"
RPM_HASH = "d7df0939e04c3bf6652c4acd4c4847954887605259f9e09fbe4e059fe126de41dfce65ee28c40a49ef60923b62c5d4ddcdc0a90b050ad0a1dff4664e6e7167e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shortuuid \
python3.10dist-shortuuid \
python310-shortuuid \
python3dist-shortuuid"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-base \
update-alternatives"

inherit rpm
