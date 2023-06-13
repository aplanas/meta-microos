SUMMARY = "Python controller library for Tor"
DESCRIPTION = "Cepa is a fork of stem that adds support for v3 onion client authentication. \
 \
Stem is a Python controller library for Tor. \
With it you can use Tor's control protocol to script against the Tor process, or build things such as Nyx."
LICENSE = "LGPL-3.0-only"

PV = "1.8.4"

RPM_NAME = "python310-cepa-1.8.4-2.2.noarch.rpm"
RPM_HASH = "77d1add951abfe894c4ebde6304142d10771d2032649a46cb184e43e58c52ee978b511245d7b3140915f0dcd4f988fee8131a8873fca0a46d20b1aa725df13a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cepa \
python3-stem \
python3.10dist(cepa) \
python310-cepa \
python310-stem \
python3dist(cepa)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-cryptography \
update-alternatives"

inherit rpm
