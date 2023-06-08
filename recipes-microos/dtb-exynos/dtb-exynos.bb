SUMMARY = "Samsung Exynos based arm64 systems"
DESCRIPTION = "Device Tree files for Samsung Exynos based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-exynos-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "516d1a1110d216db1214aeb07b75df3232141bdcc9995f25d1a46690f088ba4ef196736ec7f2ad79b9fa0895344e0ce5b4f24182128952107751233f3a5caac7"

RPROVIDES:${PN} += "dtb-exynos dtb-exynos(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
