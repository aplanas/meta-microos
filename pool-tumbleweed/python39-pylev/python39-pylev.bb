SUMMARY = "A pure Python Levenshtein implementation"
DESCRIPTION = "A pure Python Levenshtein implementation."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python39-pylev-1.4.0-2.1.noarch.rpm"
RPM_HASH = "480af52318666deb7837122a6036a9c6550394e476f75902e7a5e7bf332456dbf8b0f00f713ef138314814c4d6843c89b99c3ff4e5f243ca9aba2d76146e7796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pylev) \
python39-pylev \
python3dist(pylev)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
