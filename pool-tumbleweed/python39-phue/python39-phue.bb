SUMMARY = "Philips Hue Python library"
DESCRIPTION = "Full featured Python library to control the Philips Hue lighting system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python39-phue-1.1-2.8.noarch.rpm"
RPM_HASH = "d0f0de5f7a581313cd59588333864f3aa68083fd1a29d35362008abe653c669dd5ab2b456e512c680f904274a731ef9249bf600d325432098a3a484e71330b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-phue \
python39-phue \
python3dist-phue"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi"

inherit rpm
