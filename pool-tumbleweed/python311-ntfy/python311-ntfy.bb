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

RPM_NAME = "python311-ntfy-2.7.0-9.4.noarch.rpm"
RPM_HASH = "7e435b8fbf6834eaa8baf1d677a36bd79a3fbad7be514b2d76e846a651ed58c6d32c924f54ee3a312dc697455755ac0338e9b6900404b34cd642bee28a2a4ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ntfy) \
python311-ntfy \
python3dist(ntfy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-appdirs \
python311-requests \
python311-ruamel.yaml \
update-alternatives"

inherit rpm
