SUMMARY = "AppliedMicro based arm64 systems"
DESCRIPTION = "Device Tree files for AppliedMicro based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-apm-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "e8b06b44c885ed8b2fbfd793a50bbf46bcf4affc945b6ccb78f11cec6ba37ee8a5691f6e285740ce5ea6e4a69934e4017761a369d21e28e76eabc91a29fb0f37"

RPROVIDES:${PN} += "dtb-apm dtb-apm(aarch-64) dtb-apm-mustang multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
