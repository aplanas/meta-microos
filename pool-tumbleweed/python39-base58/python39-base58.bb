SUMMARY = "Base58 and Base58Check implementation"
DESCRIPTION = "Base58 and Base58Check implementation compatible with what is used by the bitcoin network."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-base58-2.1.1-1.11.noarch.rpm"
RPM_HASH = "fa51c0aa9d16cab2f67cef5551466b7b417e7fce9a71fa43a8c7a9fcc603bd547e0f504d3004ada864f5d69a7d2fd7370a1e0291f2834c08a17a14503349a924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-base58 \
python39-base58 \
python3dist-base58"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
