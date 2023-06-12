SUMMARY = "Pure-Python SPAKE2"
DESCRIPTION = "SPAKE2 password-authenticated key exchange."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python310-spake2-0.8-2.17.noarch.rpm"
RPM_HASH = "c4bb0416bc1cf33600fbdae65262cb78a42b5393198fe8b2b8e9fdd4337d651bb18c9998f0dc9f4b88cae170b243bf298737a018ae5ee9d5fabd258338454420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spake2 \
python3.10dist(spake2) \
python310-spake2 \
python3dist(spake2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
