SUMMARY = "Tool to automatically purge old trashed files"
DESCRIPTION = "Autotrash is a small python script to automatically remove (permanently delete) \
trashed files. It relies on the FreeDesktop.org Trash files for it's deletion \
information."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.4"

RPM_NAME = "autotrash-0.4.4-1.5.noarch.rpm"
RPM_HASH = "c0d495eaa0fa3448608cde14e2ff4b0312f46294e0aa675bcf1d09e6544fe5b794573719c85e4278c8e888d08465dabe75fcf1385afabe1fe41b185ba3a2221c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autotrash \
python3.10dist-autotrash \
python3dist-autotrash"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
