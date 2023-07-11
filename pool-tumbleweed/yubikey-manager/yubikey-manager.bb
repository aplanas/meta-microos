SUMMARY = "Python 3 library and command line tool for configuring a YubiKey"
DESCRIPTION = "Python 3 library and command line tool for configuring a YubiKey. \
YubiKey Manager (ykman) is a command line tool for configuring a YubiKey over \
all transports. It is capable of reading out device information as well as \
configuring several aspects of a YubiKey, including enabling or disabling \
connection transports an programming various types of credentials."
LICENSE = "BSD-2-Clause"

PV = "4.0.9"

RPM_NAME = "yubikey-manager-4.0.9-2.3.noarch.rpm"
RPM_HASH = "64caabd9ca3e6e1757c22de8becf5448b4eebe18cbcce1a672a77d7c52030fc3d8f70ee9e099cacbf0e1502dcab6296d20135da6a2c291492064e910d6791a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yubikey-manager \
python3.11dist-yubikey-manager \
python3dist-yubikey-manager \
yubikey-manager"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-click \
python3-cryptography \
python3-fido2 \
python3-pyscard"

inherit rpm
