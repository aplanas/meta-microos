SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "python310-ldas-tools-al-swig-2.6.7-3.8.aarch64.rpm"
RPM_HASH = "6d36eb836caeda64a61d600a181ec7b60c64091e94ea8ad667fa091f3a309de0ff1ef6316caf1368efe7248f8e00fb10eb16ea564e1b5dffb4d9fe952e5a4d7a"

RPROVIDES:${PN} += "python310-ldas-tools-al-swig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
