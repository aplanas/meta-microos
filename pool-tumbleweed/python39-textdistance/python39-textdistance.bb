SUMMARY = "Compute distance between the two texts"
DESCRIPTION = "Compute distance between sequences. 30+ algorithms, pure python \
implementation, common interface, optional external libs usage."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python39-textdistance-4.5.0-1.5.noarch.rpm"
RPM_HASH = "f0abbb8d5a9c922fb259c1548f73a15abe5bd6406a096944f960ccfc0bccb035b70edef29805ea0e1b24386012b87515ed8c622ce06416d56301df45ef3066a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-textdistance \
python39-textdistance \
python3dist-textdistance"

RDEPENDS:${PN} += "python-abi"

inherit rpm
