SUMMARY = "Development files for zlibrary"
DESCRIPTION = "This package contains the libraries amd header files that are needed \
for writing applications with Zlibrary."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "zlibrary-devel-0.99.4-3.28.aarch64.rpm"
RPM_HASH = "2130fdead62234efd81c41285bc86f964a917ecb0b0234f9b2a4a0ece786dff7878f4f0d42153a131038aa4e77f7875ecd301dac50255479297d01f93dd9f1f0"

RPROVIDES:${PN} += "zlibrary-devel"

RDEPENDS:${PN} += "libzlui0-99 \
zlibrary0-99"

inherit rpm
