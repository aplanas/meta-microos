SUMMARY = "Library for encoding variable length integer data"
DESCRIPTION = "varints are a common encoding for variable length integer data, \
used in libraries such as sqlite, protobuf, v8, and more."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-varint-1.0.2-1.12.noarch.rpm"
RPM_HASH = "24c7c3cbb582d44ceb11c31a9398d87aef31786082fed07d4903e312fb36f15ba203f36f042ad16c8575377bdd0adb9a6ec559bb26dbe75f93653313be977cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(varint) \
python39-varint \
python3dist(varint)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
