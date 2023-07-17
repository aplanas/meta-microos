SUMMARY = "Documentation for qt6-datavis3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavis3d-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b4b5ad756da3bebe1de961b5e33d6a85f16806dcec786a570661dad83096cc64c094d5d02347c895fa6c227f5eeb29f77a9e50e4180e91fd3b16dbd8f0feb9fa"

RPROVIDES:${PN} += "qt6-datavis3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
