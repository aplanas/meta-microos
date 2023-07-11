SUMMARY = "Documentation for notmuch"
DESCRIPTION = "This package contains the info pages for notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-doc-0.37-2.6.aarch64.rpm"
RPM_HASH = "3fcc741a65a67233afb6cb996bc6f971e8bd1ceb717739562105b7b9c36c1aab14ddd829a41e45770f49c1c916272bb34a0644c4c8598555d9b6f5c60aa20099"

RPROVIDES:${PN} += "notmuch-doc"

RDEPENDS:${PN} += "notmuch"

inherit rpm
