SUMMARY = "Python controller library for Tor"
DESCRIPTION = "Cepa is a fork of stem that adds support for v3 onion client authentication. \
 \
Stem is a Python controller library for Tor. \
With it you can use Tor's control protocol to script against the Tor process, or build things such as Nyx."
LICENSE = "LGPL-3.0-only"

PV = "1.8.4"

RPM_NAME = "python39-cepa-1.8.4-2.4.noarch.rpm"
RPM_HASH = "bb3012b4017b4882e04a74f25ef9ba2c2c92742ad25c55ce0d07d4edb6369827ec7389c7919eab5ab0d9b2dfa54b7212ed787ee3c60b34888d4ee397f2bd2c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cepa \
python39-cepa \
python39-stem \
python3dist-cepa"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-cryptography \
update-alternatives"

inherit rpm
