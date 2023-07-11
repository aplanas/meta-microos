SUMMARY = "Compute distance between the two texts"
DESCRIPTION = "Compute distance between sequences. 30+ algorithms, pure python \
implementation, common interface, optional external libs usage."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python311-textdistance-4.5.0-1.5.noarch.rpm"
RPM_HASH = "a8d9fbdfbdfff0dacf3866578792f435ef34a4cad2193f39f24538bfd03a873509ec115d578f8ba169f59d4b66c348237ee1f9efdfb56532215b9983f43bf006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textdistance \
python3.11dist-textdistance \
python311-textdistance \
python3dist-textdistance"

RDEPENDS:${PN} += "python-abi"

inherit rpm
