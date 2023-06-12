SUMMARY = "Command line client for orthos2"
DESCRIPTION = "Command line client that provides a shell like command \
line interface based on readline."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.31+git.5a38e82"

RPM_NAME = "orthos-client-1.2.31+git.5a38e82-1.5.noarch.rpm"
RPM_HASH = "8be6763216cff936591701cef8c986168e0e499b9fbfabfdb7ebbd2bb2ddecbf983687b560fceffc9b7b5ec21e4d6929f7f4d329b7ab8ee78cdf554dc3ed3f3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orthos-client"
RDEPENDS:${PN} += "/usr/bin/env \
python3-base \
python3-pytz"

inherit rpm
