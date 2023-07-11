SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "python311-ldas-tools-al-swig-2.6.7-3.8.aarch64.rpm"
RPM_HASH = "b464674c526b1f332e658d6cebaecf47b6874a7ed03310312fa56838b8cb8040602c519d8cb679f42ac6ad9a626ccf699b2866548c31e67167b23f61f01a068b"

RPROVIDES:${PN} += "python3-ldas-tools-al-swig \
python311-ldas-tools-al-swig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
