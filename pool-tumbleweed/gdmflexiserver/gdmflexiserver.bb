SUMMARY = "Compatibility Wrapper for Display Managers"
DESCRIPTION = "The GDMFlexiServer tool interacts with the display manager to \
enable fast user switching. This package contains a wrapper that \
selects the correct Gdmflexiserver implementation, based on the \
running display manager."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdmflexiserver-44.1-1.1.noarch.rpm"
RPM_HASH = "b307b78e3c76dd6c4bbb124537f533493de93643ad98d8595b42317d986f44fbe11ef4417459df9347f6630dcad27932ee0b8f33bc912d5d655f9c7e7e4ab224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdmflexiserver"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
