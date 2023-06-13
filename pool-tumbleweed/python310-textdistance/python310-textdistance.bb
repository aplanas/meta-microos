SUMMARY = "Compute distance between the two texts"
DESCRIPTION = "Compute distance between sequences. 30+ algorithms, pure python \
implementation, common interface, optional external libs usage."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python310-textdistance-4.5.0-1.3.noarch.rpm"
RPM_HASH = "722cebf91edaf3626653f70e72eb856d1be168794242a6b9b52b880c3a28e4138be69a85739d18d1a4d88a4c6cf7abfad6f2e4125631c367791c03c9e8d57443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textdistance \
python3.10dist(textdistance) \
python310-textdistance \
python3dist(textdistance)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
