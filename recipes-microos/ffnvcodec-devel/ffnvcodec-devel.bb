SUMMARY = "FFmpeg version of NVIDIA codec API headers"
DESCRIPTION = "This package contains the headers required for FFmpeg to interface \
with NVIDIA codec APIs."
LICENSE = "MIT"

PV = "11.1.5.2"

RPM_NAME = "ffnvcodec-devel-11.1.5.2-1.1.aarch64.rpm"
RPM_HASH = "460bef35fc74142696a98cbc653a007e65178d3677c6806df261f2657786a62c5de9ce93604210c3ede3ac8619de5994e3ecddb413e1a5fbca84c3aab62a087a"

RPROVIDES:${PN} += "ffnvcodec-devel ffnvcodec-devel(aarch-64) pkgconfig(ffnvcodec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
