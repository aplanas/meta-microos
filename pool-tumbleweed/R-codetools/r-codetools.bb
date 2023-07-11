SUMMARY = "Package provides recommended R-codetools"
DESCRIPTION = "This packages provides R-codetools, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.2.19"

RPM_NAME = "R-codetools-0.2.19-46.1.aarch64.rpm"
RPM_HASH = "f5ba686615f2d6eb89bb2c2e072ac4644ed989a1c8847294e8e074add51078e0c0dab5f5c26b257046008b8272add74d9d0fa1ded721584afbe432fbdabf4ea6"

RPROVIDES:${PN} += "R-codetools"

RDEPENDS:${PN} += "R-base"

inherit rpm
