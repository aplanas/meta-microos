SUMMARY = "Tool to automatically purge old trashed files"
DESCRIPTION = "Autotrash is a small python script to automatically remove (permanently delete) \
trashed files. It relies on the FreeDesktop.org Trash files for it's deletion \
information."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.4"

RPM_NAME = "autotrash-0.4.4-1.6.noarch.rpm"
RPM_HASH = "ca9ba623b5a9cfe706733d7c2aa779515b9155f7f7a1fc03e411ebf3cb511eaabcef8263042d07bf873a240ba160a32a40ccae21b66a6b6ee7e14762e36fa036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autotrash \
python3.11dist-autotrash \
python3dist-autotrash"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
