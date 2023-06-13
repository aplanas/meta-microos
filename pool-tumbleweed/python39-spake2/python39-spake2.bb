SUMMARY = "Pure-Python SPAKE2"
DESCRIPTION = "SPAKE2 password-authenticated key exchange."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python39-spake2-0.8-2.17.noarch.rpm"
RPM_HASH = "5ebb55834d8eb52118a706f3591ce39cbbeb86fbf57f0871810a920c808ace601f7e8e4a30cb5e712f790f1accf2c4bff94a02b85e7e54a8037e4f02fbf9ade1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(spake2) \
python39-spake2 \
python3dist(spake2)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
