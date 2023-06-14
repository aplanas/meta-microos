SUMMARY = "Library for Parsing ICU MessageFormat Messages"
DESCRIPTION = "An unopinionated library for parsing ICU MessageFormat messages \
into both ASTs and, optionally, token lists. \
 \
This library is mainly a re-implementation of the JavaScript library \
format-message-parse with a few extra configuration flags."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pyicumessageformat-1.0.0-1.15.noarch.rpm"
RPM_HASH = "7c9a56248c8a580ba5fd846467ee215777ff31c52d9cd3c2c6aed4b99223c52186a28c7dcf2c54a0c4015b3d65ecc3c00e5b77009e5b5ef53f63dd9519b69c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyicumessageformat \
python311-pyicumessageformat \
python3dist-pyicumessageformat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
