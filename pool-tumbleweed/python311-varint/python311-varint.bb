SUMMARY = "Library for encoding variable length integer data"
DESCRIPTION = "varints are a common encoding for variable length integer data, \
used in libraries such as sqlite, protobuf, v8, and more."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-varint-1.0.2-1.12.noarch.rpm"
RPM_HASH = "910947985e6374a74753399410c95ddbacf2b69d0b2e53b6006088e6f36cf32f65216f4ca91f1a045bfb82f5541493815778ff633ef0590a3b63645ddc089e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(varint) \
python311-varint \
python3dist(varint)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
