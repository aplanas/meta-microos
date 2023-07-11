SUMMARY = "Python controller library for Tor"
DESCRIPTION = "Cepa is a fork of stem that adds support for v3 onion client authentication. \
 \
Stem is a Python controller library for Tor. \
With it you can use Tor's control protocol to script against the Tor process, or build things such as Nyx."
LICENSE = "LGPL-3.0-only"

PV = "1.8.4"

RPM_NAME = "python310-cepa-1.8.4-2.4.noarch.rpm"
RPM_HASH = "07b9170232ee71a581a993b71161a3a4ae085375bc75ca533d2181fee15d10376fe4e05fe755fff504e53a72d1937c8f35e4f21da8ed76238aa634d99eb2e749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cepa \
python310-cepa \
python310-stem \
python3dist-cepa"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-cryptography \
update-alternatives"

inherit rpm
