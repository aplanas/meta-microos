SUMMARY = "Documentation for APFEL, a PDF evolution library"
DESCRIPTION = "This package provides documentation for APFEL in PDF (Portable \
Document Format), a PDF (Probability Distribution Function) evolution \
library."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "apfel-doc-3.0.6-1.19.aarch64.rpm"
RPM_HASH = "04ca172f472321af94bbf4f3ba929ad16ab6fe18472b0a802bd5ef763db8e9803f018956fa9319e60e5459207560e4e872b37a2a11c1fa5667bd5333f222b705"

RPROVIDES:${PN} += "apfel-doc"

RDEPENDS:${PN} += ""

inherit rpm
