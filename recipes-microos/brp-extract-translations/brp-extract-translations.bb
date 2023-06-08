SUMMARY = "Extract translations from desktop files, polkit actions, mimetype descriptions and AppStream metainfo"
DESCRIPTION = "Extract translations from all desktop files, polkit actions, mimetype descriptions \
and AppStream metainfo found in build root"
LICENSE = "GPL-2.0-or-later"

PV = "84.87"

RPM_NAME = "brp-extract-translations-84.87-6.2.noarch.rpm"
RPM_HASH = "db7124b0e41d479f9c738cf6cdc38fc52a325c760d12c53e48d51d4bd011fb6e7e0763b800b3755b1057044ae8cc5252e86519f4182c344103d5f92a5d19f2b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brp-extract-translations brp-trim-desktop"
RDEPENDS:${PN} += "/bin/bash libxslt-tools"

inherit rpm
