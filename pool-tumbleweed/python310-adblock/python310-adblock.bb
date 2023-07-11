SUMMARY = "Brave's adblock library in Python"
DESCRIPTION = "Python wrapper for Brave's adblocking library."
LICENSE = "Apache-2.0 | MIT"

PV = "0.6.0"

RPM_NAME = "python310-adblock-0.6.0-2.4.aarch64.rpm"
RPM_HASH = "e69409e3c6ce6568295a303dfa4009cab852c2a12c14d6499fded1f8ba63d4f4bbfacd713311eb8b82716d6a1f7d2bf9cfbe61471c530734165b87474eeb7837"

RPROVIDES:${PN} += "python3.10dist-adblock \
python310-adblock \
python3dist-adblock"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
