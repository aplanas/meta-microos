SUMMARY = "Trie data structure for Python"
DESCRIPTION = "A trie data structure for Python (2.x and 3.x). Uses libdatrie."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "python310-datrie-0.8.2-3.13.aarch64.rpm"
RPM_HASH = "d9347b621e8e5e99eb8fac6b7eb0af5a90a21ebfee579923dfd3cf3635a8f19ad02cf70c691c839538b12b7b29d4e60011c62eb96b253675d610f79fe59a9608"

RPROVIDES:${PN} += "python3.10dist-datrie \
python310-datrie \
python3dist-datrie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
