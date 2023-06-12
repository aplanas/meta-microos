SUMMARY = "Scripts and data to allow locale switching in live media"
DESCRIPTION = "This package contains scripts and data to allow setting the locale (+ console font and keyboard \
layout) on live media."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "live-langset-data-2.0-17.2.noarch.rpm"
RPM_HASH = "6c79b303497f3018724437089b85eb052a9f9b61c41141d2340fb8f9d41aebd0af0b36d8fdb4a942a0a411d15284c28e7a1e8d395c1c33835f9c3be00bbbb425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "live-langset-data"
RDEPENDS:${PN} += "/bin/sh \
sed \
systemd"

inherit rpm
