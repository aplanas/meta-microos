SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "python39-ldas-tools-al-swig-2.6.7-3.8.aarch64.rpm"
RPM_HASH = "b0a44dfcd88a1078d6abb004bb2914e181c429ef8ac3364fc8a30b5853ff8f50a200ed61a44b393a57388d216ccf51c9ecf7d4f3f9b10abb987ff35b6554a00b"

RPROVIDES:${PN} += "python39-ldas-tools-al-swig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
