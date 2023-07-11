SUMMARY = "Library for Parsing ICU MessageFormat Messages"
DESCRIPTION = "An unopinionated library for parsing ICU MessageFormat messages \
into both ASTs and, optionally, token lists. \
 \
This library is mainly a re-implementation of the JavaScript library \
format-message-parse with a few extra configuration flags."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pyicumessageformat-1.0.0-1.17.noarch.rpm"
RPM_HASH = "1c4abee9690be750a0e9f086d87ff4581473c217b964aa9567c354b960239820918f0513bbbdd793225eccf2e06ac2ed5c19c2d86dbe6253787289d468931fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyicumessageformat \
python3.11dist-pyicumessageformat \
python311-pyicumessageformat \
python3dist-pyicumessageformat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
