SUMMARY = "A generator library for concise, unambiguous and URL-safe UUIDs"
DESCRIPTION = "A library that generates short, pretty, unambiguous unique IDs \
by using an extensive, case-sensitive alphabet and omitting \
similar-looking letters and numbers."
LICENSE = "BSD-3-Clause"

PV = "1.0.11"

RPM_NAME = "python39-shortuuid-1.0.11-1.1.noarch.rpm"
RPM_HASH = "25c9e4cba6deafa2f07343c8c49f63b61bb0ed3b4a9b6f30b4d7a8e5e4694e2dfedd2bce8f69baa3719094e189eef3b5598ff629d4f5f92ca776247eb0708688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-shortuuid \
python39-shortuuid \
python3dist-shortuuid"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-base \
update-alternatives"

inherit rpm
