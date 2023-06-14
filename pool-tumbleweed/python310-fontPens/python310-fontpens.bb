SUMMARY = "A collection of classes implementing the pen protocol for manipulating glyphs"
DESCRIPTION = "A collection of classes implementing the pen protocol for manipulating glyphs."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python310-fontPens-0.2.4-5.7.noarch.rpm"
RPM_HASH = "d5ca911babd8380bff9695a3d5b6f9b575a918410e233016508d8b3e6973153f25683b7680bef3f34403b816b67caefbd23b9438ebbf828b6b0a04729b2bda1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fontPens \
python3.10dist-fontpens \
python310-fontPens \
python3dist-fontpens"

RDEPENDS:${PN} += "python-abi \
python310-FontTools"

inherit rpm
