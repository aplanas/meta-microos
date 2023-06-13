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

RPM_NAME = "python39-ntfy-2.7.0-9.4.noarch.rpm"
RPM_HASH = "6bef8eb7b70fe709dd56a98d21f682ff04cc9f07cc0ed8250472a869bbf719e56b810d5aaf53cfd68cf6e6e2ecee881916876060203a9ebb377c7ffe7692007f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ntfy) \
python39-ntfy \
python3dist(ntfy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-appdirs \
python39-requests \
python39-ruamel.yaml \
update-alternatives"

inherit rpm
