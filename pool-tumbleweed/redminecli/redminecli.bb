SUMMARY = "Command line interface for Redmine"
DESCRIPTION = "A command line interface for Redmine."
LICENSE = "CECILL-B"

PV = "1.3.0"

RPM_NAME = "redminecli-1.3.0-1.11.noarch.rpm"
RPM_HASH = "3aaadf954c3a503fe9b1c114500326394eeb1f09a308c8a83e15b53343dc998756089bd75728213849635e48643186c46b4438b98eff37118f4b3b2b37159695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-redminecli \
python3dist-redminecli \
redminecli"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-click \
python3-requests"

inherit rpm
