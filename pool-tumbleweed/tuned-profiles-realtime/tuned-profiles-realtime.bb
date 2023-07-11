SUMMARY = "Additional tuned profiles targeted to realtime"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to realtime."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-realtime-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "4b761b352006561d7da738670a197d6c66d225ace38076cf180309e8b4ad787b1acc52c075870dfce26486f2379106c96bfee942b08254ee92f4c162def9d6ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tuned-profiles-realtime \
tuned-profiles-realtime"

RDEPENDS:${PN} += "/usr/bin/bash \
tuned"

inherit rpm
