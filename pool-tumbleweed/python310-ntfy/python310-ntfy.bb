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

RPM_NAME = "python310-ntfy-2.7.0-9.6.noarch.rpm"
RPM_HASH = "4ec17b64a5bae32a2241d819088ca08ad7856758c097bead56c2f03beeb61ebb827d205853f1b56e9a2507ae51d1a1831849a30f7eb498502be2e64241fb14a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ntfy \
python310-ntfy \
python3dist-ntfy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-appdirs \
python310-requests \
python310-ruamel.yaml \
update-alternatives"

inherit rpm
