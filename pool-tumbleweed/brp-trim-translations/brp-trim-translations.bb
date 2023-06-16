SUMMARY = "Trim translations from desktop files, polkit actions, mimetype descriptions and AppStream metainfo"
DESCRIPTION = "Extract and trim translations from all desktop files, polkit \
actions, mimetype descriptions and AppStream metainfo found in \
build root"
LICENSE = "GPL-2.0-or-later"

PV = "84.87"

RPM_NAME = "brp-trim-translations-84.87-6.2.noarch.rpm"
RPM_HASH = "02650ad15ba88bac23effd3fa005db45d62208bca25034bae0320df6c72cd5b3503a90420c48a19c981b3a719a37f43746529bda53d346532d358969a8883ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brp-trim-desktop \
brp-trim-translations"

RDEPENDS:${PN} += "/usr/bin/bash \
awk \
libxslt-tools"

inherit rpm
