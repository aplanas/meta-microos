SUMMARY = "Files for developing applications using surgescript"
DESCRIPTION = "This package contains files required for \
developing applications using surgescript."
LICENSE = "Apache-2.0 & BSD-1-Clause & BSD-2-Clause & SUSE-Public-Domain"

PV = "0.5.6.1"

RPM_NAME = "surgescript-devel-0.5.6.1-2.3.aarch64.rpm"
RPM_HASH = "fe71afc2e9ad6f62c967cbe105d7c63f9b5c030e5d193a12b05a8e3fcf96bcb2b0ff83b1e031bcc996fd2ef24e20a79d4b1be9cd621582dc18b79d37371a1e32"

RPROVIDES:${PN} += "pkgconfig(surgescript) \
surgescript-devel \
surgescript-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsurgescript0_5_6"

inherit rpm
