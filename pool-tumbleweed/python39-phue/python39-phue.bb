SUMMARY = "Philips Hue Python library"
DESCRIPTION = "Full featured Python library to control the Philips Hue lighting system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python39-phue-1.1-2.6.noarch.rpm"
RPM_HASH = "c832fa5714ddf81a836c213ab4dd020728b1d02ede723e01ccb1580620cfe050b6719d5872428d677e0133783e4a4ae2177bd3b850c77d6897fa4eda0acf73d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(phue) \
python39-phue \
python3dist(phue)"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python(abi)"

inherit rpm
