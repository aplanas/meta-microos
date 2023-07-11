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

RPM_NAME = "python39-ntfy-2.7.0-9.6.noarch.rpm"
RPM_HASH = "2f3fa97e446c8ca57debc27ad6b21e6ebd163d6fc87635196044766b0ef44d25d1ebe6fa6bf938127b6f5302b4f4e666bb5b69bff96fbfcb505049be7fdc6759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ntfy \
python39-ntfy \
python3dist-ntfy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-appdirs \
python39-requests \
python39-ruamel.yaml \
update-alternatives"

inherit rpm
