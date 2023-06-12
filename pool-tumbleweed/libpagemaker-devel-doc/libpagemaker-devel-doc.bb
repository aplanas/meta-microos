SUMMARY = "Documentation for the libpagemaker API"
DESCRIPTION = "This package contains documentation for the libpagemaker API."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-devel-doc-0.0.4-1.29.noarch.rpm"
RPM_HASH = "910ac9952831b2acf03cf4f9c300719b33543b898b3174c03ffce56cfe1319ce29b262e00ed119b21bea6696e0e7440529dca67a966c54f1e28458a747b99f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpagemaker-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
