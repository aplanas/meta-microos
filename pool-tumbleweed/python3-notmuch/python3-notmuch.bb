SUMMARY = "Python3 bindings for notmuch"
DESCRIPTION = "Python3 interface (bindings) for notmuch"
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "python3-notmuch-0.37-3.1.aarch64.rpm"
RPM_HASH = "ba54ce1f00babcfa0d2c1cdab2cda96b63fc04104379916572a08676a2295037b4e9cb1e41c92cc8738bb4b6eb31057c1565bf59175d927bd11d7e324323ed45"

RPROVIDES:${PN} += "python3-notmuch \
python3.11dist-notmuch \
python3dist-notmuch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
