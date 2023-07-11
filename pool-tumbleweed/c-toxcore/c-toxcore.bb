SUMMARY = "Secure decentralized instant messaging application"
DESCRIPTION = "Project Tox, also known as Tox, is a FOSS instant messaging \
application aimed to replace Skype. \
With the rise of government monitoring programs, \
Tox provides an easy to use application that allows you to connect \
with friends and family without anyone else listening in. \
While other big-name services require you to pay for features, \
Tox is totally free and comes without advertising"
LICENSE = "GPL-3.0-only"

PV = "0.2.18"

RPM_NAME = "c-toxcore-0.2.18-1.5.aarch64.rpm"
RPM_HASH = "8fa0ca0845f3775238aa4d8f14f44bd353719842503d106570f6460a182bb946343bff0cb53251c895405ae48159eaa3b2f40253627fbfd1964b95e403efcf63"

RPROVIDES:${PN} += "c-toxcore"

RDEPENDS:${PN} += "shadow \
systemd"

inherit rpm
