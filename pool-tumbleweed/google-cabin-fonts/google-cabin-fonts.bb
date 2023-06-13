SUMMARY = "Humanist Sans Serif Font"
DESCRIPTION = "The Cabin font family is a humanist sans with 4 weights and true italics, \
inspired by Edward Johnston’s and Eric Gill’s typefaces, with a touch of \
modernism. Cabin incorporates modern proportions, optical adjustments, and some \
elements of the geometric sans. It remains true to its roots, but has its own \
personality. \
 \
The weight distribution is almost monotone, although top and bottom curves are \
slightly thin. Counters of the b, g, p and q are rounded and optically \
adjusted. The curved stem endings have a 10 degree angle. E and F have shorter \
center arms. M is splashed. \
 \
Designer: Pablo Impallari"
LICENSE = "OFL-1.1"

PV = "3.001+git1595464381.70efa8c"

RPM_NAME = "google-cabin-fonts-3.001+git1595464381.70efa8c-1.6.noarch.rpm"
RPM_HASH = "5581b194dcc9cf1d011b68865d9116bc3e5f0b4dce9d02420a65671773f3802b6a22bf8833e9b409a832df18e463d5076e1f7e7c08734a02e14b44dd8da0e967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-cabin-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
