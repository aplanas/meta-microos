SUMMARY = "Appstream processor employed by kiwi"
DESCRIPTION = "A wrapper around appstream-builder, called by kiwi in order to produce AppStream metadata \
for the repositories to be published"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "openSUSE-appstream-process-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "585d977cc4d77c0cb4dbd154729e6dbecced70d88708401b4ff3f133a9dd7d42496f8d469fd3f4e0c4efa333f5a2063ff1d71f1a1f8eae874c4987080df9a8cb"

RPROVIDES:${PN} += "openSUSE-appstream-process"

RDEPENDS:${PN} += "/usr/bin/bash \
appstream-glib \
openSUSE-appdata-extra"

inherit rpm
