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

RPM_NAME = "python311-ntfy-2.7.0-9.6.noarch.rpm"
RPM_HASH = "9a02c0c85690a68ecde1ff7efbf0dab87bab5f895317a838c05104605aca8d133a8f9b1797bc6a4f0dbf905be1c5f895b6a422efae40d26f59024279e1c02a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntfy \
python3.11dist-ntfy \
python311-ntfy \
python3dist-ntfy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-appdirs \
python311-requests \
python311-ruamel.yaml \
update-alternatives"

inherit rpm
