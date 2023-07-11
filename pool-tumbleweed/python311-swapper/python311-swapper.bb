SUMMARY = "The unofficial Django swappable models API"
DESCRIPTION = "Swapper is an unofficial API for the undocumented but very \
powerful Django feature: swappable models. Swapper facilitates \
implementing arbitrary swappable models in your own reusable apps."
LICENSE = "MIT"

PV = "1.1.2.post1"

RPM_NAME = "python311-swapper-1.1.2.post1-2.9.noarch.rpm"
RPM_HASH = "8e9801e77d5dcbc71f20173817c272eddd0b39f561995f774d1208605b431c5d2df6a5a12e0fa928ac52179c2beca4dc0ae2d088f2af8cae4f3deeaed7f426e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swapper \
python3.11dist-swapper \
python311-swapper \
python3dist-swapper"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
