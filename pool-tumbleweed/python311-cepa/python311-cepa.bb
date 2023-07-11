SUMMARY = "Python controller library for Tor"
DESCRIPTION = "Cepa is a fork of stem that adds support for v3 onion client authentication. \
 \
Stem is a Python controller library for Tor. \
With it you can use Tor's control protocol to script against the Tor process, or build things such as Nyx."
LICENSE = "LGPL-3.0-only"

PV = "1.8.4"

RPM_NAME = "python311-cepa-1.8.4-2.4.noarch.rpm"
RPM_HASH = "28740dfefdeebe39a3edb33dae1c1aff9d31aa5a49ae084aa55c644aef8837229e008d2c8d1a7c4f889246b48bf6987accde68988132acda16c041fe13394914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cepa \
python3-stem \
python3.11dist-cepa \
python311-cepa \
python311-stem \
python3dist-cepa"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cryptography \
update-alternatives"

inherit rpm
