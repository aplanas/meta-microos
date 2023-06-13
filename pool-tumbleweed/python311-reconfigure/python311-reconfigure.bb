SUMMARY = "Python ORM for config files"
DESCRIPTION = "Python ORM for config files."
LICENSE = "LGPL-3.0-only"

PV = "0.1.82"

RPM_NAME = "python311-reconfigure-0.1.82-1.16.noarch.rpm"
RPM_HASH = "d07e56e703303bd135f84832af737e63c6568c66ff58b5d4dbbecc73b21cbe42f361b6ea01ce3903435bada9bfbadc9d98e3b92d445196724589426d7bf9bc73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(reconfigure) \
python311-reconfigure \
python3dist(reconfigure)"

RDEPENDS:${PN} += "python(abi) \
python311-chardet"

inherit rpm
