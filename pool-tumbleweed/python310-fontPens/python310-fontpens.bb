SUMMARY = "A collection of classes implementing the pen protocol for manipulating glyphs"
DESCRIPTION = "A collection of classes implementing the pen protocol for manipulating glyphs."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python310-fontPens-0.2.4-5.9.noarch.rpm"
RPM_HASH = "dbba70c0cc5b1f3c104bbaf4a96042871079e39d19bb227eafb03a22d9df7c2b829ead3aec8a10b61dabc33b7483a32e150b79360bb822e825a30e257af42e7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fontpens \
python310-fontPens \
python3dist-fontpens"

RDEPENDS:${PN} += "python-abi \
python310-FontTools"

inherit rpm
