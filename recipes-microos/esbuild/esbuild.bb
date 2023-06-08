SUMMARY = "A JavaScript bundler written for speed"
DESCRIPTION = "esbuild is a JavaScript bundler and minifier. \
 \
%{gopkg}"
LICENSE = "MIT"

PV = "0.17.5"

RPM_NAME = "esbuild-0.17.5-1.3.aarch64.rpm"
RPM_HASH = "b928d942698a3ff032c5844e2044ff27e7f4b82933afd47f080cf2c475e26de44c479950b98f663388a98009f16b1b38cc17f15e05532f6f831c03187087f8a8"

RPROVIDES:${PN} += "esbuild esbuild(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
