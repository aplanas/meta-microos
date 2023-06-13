SUMMARY = "Amlogic based arm64 systems"
DESCRIPTION = "Device Tree files for Amlogic based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-amlogic-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "622c115029a84670e3ece9ed93144970a7d1c55fd74755e7601d866fef4c603d78cedad8a2ef0c040fd6ed4c6dc9f414e15aade85167bdd26d2a8ba8eb8d90b5"

RPROVIDES:${PN} += "dtb-amlogic \
dtb-amlogic(aarch-64) \
multiversion(dtb)"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
