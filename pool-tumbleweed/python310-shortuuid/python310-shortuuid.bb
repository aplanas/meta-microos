SUMMARY = "A generator library for concise, unambiguous and URL-safe UUIDs"
DESCRIPTION = "A library that generates short, pretty, unambiguous unique IDs \
by using an extensive, case-sensitive alphabet and omitting \
similar-looking letters and numbers."
LICENSE = "BSD-3-Clause"

PV = "1.0.11"

RPM_NAME = "python310-shortuuid-1.0.11-2.1.noarch.rpm"
RPM_HASH = "572d8eb8d2738ee528deef662e558e8f0d4ec056bf84b8f16f8d79577950a4677a28a14de2fcda47b4f245ab436b5aeb4d07544e035b5181857d9ea111c82157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-shortuuid \
python310-shortuuid \
python3dist-shortuuid"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-base \
update-alternatives"

inherit rpm
