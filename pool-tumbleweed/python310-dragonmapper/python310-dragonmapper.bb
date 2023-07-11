SUMMARY = "Identification and conversion functions for Chinese text processing"
DESCRIPTION = "Identification and conversion functions for Chinese text processing."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "python310-dragonmapper-0.2.6-3.3.noarch.rpm"
RPM_HASH = "5fd358476ea260a76191880c3a6159a6a8d70bc7b744344bd1f785fc45a4fd2bccdbe4edfb31099d6b4068cb68ebf25c885832ab07ab5ab75f2b85a3486315b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dragonmapper \
python310-dragonmapper \
python3dist-dragonmapper"

RDEPENDS:${PN} += "python-abi \
python310-hanzidentifier \
python310-zhon"

inherit rpm
