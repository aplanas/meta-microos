SUMMARY = "Compatibility Wrapper for Display Managers"
DESCRIPTION = "The GDMFlexiServer tool interacts with the display manager to \
enable fast user switching. This package contains a wrapper that \
selects the correct Gdmflexiserver implementation, based on the \
running display manager."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdmflexiserver-44.1-2.1.noarch.rpm"
RPM_HASH = "4e1da06e77ef2ea0e7e8cd4328e7a9c4cbf8190c36608df603b9237badb837acb26a7032bcd7c516451ad4bb7d1dadc9ae89f4a91675fbdecc73cbafa1f08efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdmflexiserver"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
