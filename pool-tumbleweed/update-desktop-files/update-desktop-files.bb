SUMMARY = "A Build Tool to Update Desktop Files"
DESCRIPTION = "This package provides further translations and a shell script to update \
desktop files. It is used by the %suse_update_desktop_file rpm macro."
LICENSE = "GPL-2.0-or-later"

PV = "84.87"

RPM_NAME = "update-desktop-files-84.87-6.2.noarch.rpm"
RPM_HASH = "3c0f925cb51a9b7784bbe628caa4abb1bfd796f575b5a618d98557629d637c65f7d634c49cac866a2f5f7f30d5ea185937b31bc8b8c4198afd687bb8fe236780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(suse_update_desktop_file) \
update-desktop-files"

RDEPENDS:${PN} += "/bin/bash \
desktop-file-utils"

inherit rpm
