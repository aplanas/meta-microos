SUMMARY = "Python3 bindings for notmuch"
DESCRIPTION = "Python3 interface (bindings) for notmuch"
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "python3-notmuch-0.37-2.4.aarch64.rpm"
RPM_HASH = "5fb4a3eea0f1bd0935e12893a01ebdad3b2f2297377e1b65f674e261286653b853a0a06ec98dd8756fd8db5b32db7062ecdbd5f628f8ad07cbb8a00fafe96a5b"

RPROVIDES:${PN} += "python3-notmuch \
python3.10dist-notmuch \
python3dist-notmuch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
