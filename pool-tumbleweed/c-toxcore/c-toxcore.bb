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

RPM_NAME = "c-toxcore-0.2.18-1.4.aarch64.rpm"
RPM_HASH = "0084738636c4a6e4298e018fe4d72dd1fa06e7fb06d642fa431b10c6c3c38231701123f72217f9d9172824a47dfed4e973a9da88096ff478f4d9d27239f73bae"

RPROVIDES:${PN} += "c-toxcore"

RDEPENDS:${PN} += "shadow \
systemd"

inherit rpm
