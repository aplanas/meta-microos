SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-ppc64-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "d5e5348847bbc256c1a02249711e7e6d81a18bfd46acde86de2f7a4929ad28186f987003787f656a23bbdfb57f64353823797b8c0f553f968b2689535109c6d3"

RPROVIDES:${PN} += "cross-ppc64-gcc13 cross-ppc64-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-ppc64-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
