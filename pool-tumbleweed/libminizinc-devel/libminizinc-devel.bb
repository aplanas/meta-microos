SUMMARY = "A high-level constraint modelling language"
DESCRIPTION = "MiniZinc is a free and open-source constraint modeling language."
LICENSE = "MPL-2.0"

PV = "2.6.4"

RPM_NAME = "libminizinc-devel-2.6.4-1.4.aarch64.rpm"
RPM_HASH = "177cab448bcd60579c77855de3474939b132525b5bca38a7520ac7617175eb8344d61e639c788d3aad4118cfca8174266871ae24782ff243c29d5b2472502017"

RPROVIDES:${PN} += "cmake-libminizinc \
libminizinc-devel"

RDEPENDS:${PN} += "minizinc"

inherit rpm
