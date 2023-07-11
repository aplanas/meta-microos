SUMMARY = "Python ordered, dynamically-expandable dot-access dictionary"
DESCRIPTION = "Python ordered, dynamically-expandable dot-access dictionary."
LICENSE = "MIT"

PV = "1.3.30"

RPM_NAME = "python311-dotmap-1.3.30-1.4.noarch.rpm"
RPM_HASH = "a1740033c8371836e5bf9118b66ca0bc2f0ea31dee128a71b70253085fb140d74ca99a50aeb2dee504e48c5dea02723f53a3f1c65e6327f3b8fe536bf47eb9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dotmap \
python3.11dist-dotmap \
python311-dotmap \
python3dist-dotmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
