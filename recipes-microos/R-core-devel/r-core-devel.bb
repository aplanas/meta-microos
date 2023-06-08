SUMMARY = "Libraries and include files for developing with R-base"
DESCRIPTION = "This package provides the necessary development headers and \
libraries to allow you to devel with R-base."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-devel-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "534d4ebc5ddaacfa8e34894190a08a0c8a7b9ae3aada0fb917f8ffce1300f800a77abb9c7e3dcb5a8c64f235b5bda6c8589305416fa5a025c3ec5d240df54ad7"

RPROVIDES:${PN} += "R-core-devel R-core-devel(aarch-64) R-devel R-devel-macros config(R-core-devel) pkgconfig(libR) rpm_macro(R_archlib) rpm_macro(R_install) rpm_macro(R_noarchlib) rpm_macro(R_rpmver) rpm_macro(R_test) rpm_macro(R_unpack) rpm_macro(R_version)"
RDEPENDS:${PN} += "/usr/bin/pkg-config R-base"

inherit rpm
