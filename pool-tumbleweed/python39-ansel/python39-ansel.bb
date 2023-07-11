SUMMARY = "Codecs for reading/writing documents in the ANSEL character set"
DESCRIPTION = "Codecs for reading/writing documents in the ANSEL character set."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-ansel-1.0.0-2.3.noarch.rpm"
RPM_HASH = "a8f5de14eb9470c24293e1e69ab6db94c61765cdf07d1ffbfe1485004a67ac363f7d64b263a597ce628469a55e674fe71c0f0635f4c9850b1537c0082a1a1a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ansel \
python39-ansel \
python3dist-ansel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
