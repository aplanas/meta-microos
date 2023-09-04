SUMMARY = "Documentation for notmuch"
DESCRIPTION = "This package contains the info pages for notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-doc-0.37-3.1.aarch64.rpm"
RPM_HASH = "c3b18eae23c04b9475c6a45fe4e8b08d891cfc05d47308d829ae2bdf84a6b5dfa95fa116de4446ab249cb8f20ce777d57cbc78cc6c807839b4e22c84dac0721d"

RPROVIDES:${PN} += "notmuch-doc"

RDEPENDS:${PN} += "notmuch"

inherit rpm
