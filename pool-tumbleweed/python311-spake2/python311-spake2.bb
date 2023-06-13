SUMMARY = "Pure-Python SPAKE2"
DESCRIPTION = "SPAKE2 password-authenticated key exchange."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python311-spake2-0.8-2.17.noarch.rpm"
RPM_HASH = "9a33327fcd49272c271457264b689ddf6cccb8d9b2041d3c9bfd86c07547fa809851f4d05a1073dcec9d4b24e686d505dc2b8780c9aff3bc75c9269c3c45ae57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(spake2) \
python311-spake2 \
python3dist(spake2)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
