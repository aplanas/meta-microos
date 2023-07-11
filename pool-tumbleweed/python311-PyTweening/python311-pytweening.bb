SUMMARY = "A collection of tweening / easing functions"
DESCRIPTION = "A collection of tweening / easing functions implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python311-PyTweening-1.0.4-1.4.noarch.rpm"
RPM_HASH = "5c6cdc917ea78578186ec4d1c7758ee735dda85a65c64fd1a6995b605c6560350455d03811f1f5f1d0252066b8e90b49e294e9d7d0c7db77fc626bdb4941d946"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyTweening \
python3.11dist-pytweening \
python311-PyTweening \
python3dist-pytweening"

RDEPENDS:${PN} += "python-abi"

inherit rpm
