SUMMARY = "Default Enlightenment theme"
DESCRIPTION = "For use with upstream branding, when using openSUSE themes, when using \
openSUSE themes Use the Flat theme instead."
LICENSE = "BSD-2-Clause & LGPL-2.1-only"

PV = "0.21.0"

RPM_NAME = "enlightenment-theme-upstream-0.21.0-30.8.aarch64.rpm"
RPM_HASH = "194b368a412958c98b0a29a302fab2a71555eae8562f14b5fff11073c5ba1a350fe279d655de90182311f488803f2e59c0d88ec3d882dacde4e213a23dac0c71"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-dft \
enlightenment-theme-upstream"

RDEPENDS:${PN} += ""

inherit rpm
