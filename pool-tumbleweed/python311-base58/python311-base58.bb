SUMMARY = "Base58 and Base58Check implementation"
DESCRIPTION = "Base58 and Base58Check implementation compatible with what is used by the bitcoin network."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-base58-2.1.1-1.11.noarch.rpm"
RPM_HASH = "0942169f81fd6b519a70c261b70be6d345c952b42409fbf53749ec65c0f1f96f913393efd7e5c08edce752098a71362c00b87a4916dddb45bd5cd732651adea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-base58 \
python3.11dist-base58 \
python311-base58 \
python3dist-base58"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
