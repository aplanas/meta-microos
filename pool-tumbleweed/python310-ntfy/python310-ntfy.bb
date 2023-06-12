SUMMARY = "A utility for sending push notifications"
DESCRIPTION = "ntfy brings notification to your shell. It can automatically provide \
desktop notifications when long running commands finish or it can send \
push notifications to your phone when a specific command finishes. \
 \
Quickstart \
---------- \
 \
    $ ntfy send test \
     \
     \
    $ ntfy done sleep 10"
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "python310-ntfy-2.7.0-9.4.noarch.rpm"
RPM_HASH = "99f96cabba58bc5ef92f151d72e9bd7c87af7975704261e72364bb461c1cd207bf7a1dc7c2c13c563ef4a0787f326114bb17cfe9477e676bd9bf247b2d9a4173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntfy \
python3.10dist(ntfy) \
python310-ntfy \
python3dist(ntfy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-appdirs \
python310-requests \
python310-ruamel.yaml \
update-alternatives"

inherit rpm
