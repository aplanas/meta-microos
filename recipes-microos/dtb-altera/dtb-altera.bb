SUMMARY = "Altera based arm64 systems"
DESCRIPTION = "Device Tree files for Altera based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-altera-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "1e1544ca8738e4f4a7e079322cff4a7a37d1c888d20ca06f281e5c23dd7cc6bcf695e94f89734eb1b252a99f7defc7041859306fb10e9c7f3c57b4fe5fd8f7c5"

RPROVIDES:${PN} += "dtb-altera dtb-altera(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
