SUMMARY = "Appstream processor employed by kiwi"
DESCRIPTION = "A wrapper around appstream-builder, called by kiwi in order to produce AppStream metadata \
for the repositories to be published"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "openSUSE-appstream-process-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "ba6eb3cd06dbb6c19b5de897d9b0bb64075a923c7320d28f41a965d32ca0e0efb428c4ea58950ae3c4a3601d00aebe48f6e63eabbef92027b84f8e22e8291fec"

RPROVIDES:${PN} += "openSUSE-appstream-process \
openSUSE-appstream-process(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
appstream-glib \
openSUSE-appdata-extra"

inherit rpm
