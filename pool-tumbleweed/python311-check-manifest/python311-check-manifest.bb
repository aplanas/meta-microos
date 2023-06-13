SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.49"

RPM_NAME = "python311-check-manifest-0.49-3.1.noarch.rpm"
RPM_HASH = "52ed51f019c5aae486ebe424bc2b8e71bab989d23199dad69f3b0ed38d5da664421f0114e4bd3f7a59cd2a4679354ebb3ee3755ed27bad4fdcae49f7953fcdb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(check-manifest) \
python311-check-manifest \
python3dist(check-manifest)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-build \
python311-setuptools \
update-alternatives"

inherit rpm
