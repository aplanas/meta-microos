SUMMARY = "A JavaScript bundler written for speed"
DESCRIPTION = "esbuild is a JavaScript bundler and minifier. \
 \
%{gopkg}"
LICENSE = "MIT"

PV = "0.17.18"

RPM_NAME = "esbuild-0.17.18-1.1.aarch64.rpm"
RPM_HASH = "a310b7ac9e4bdc9e0a9cdfdf2b2bfa4e6d09aef1e70c43467f90082af219dab3fecd8b1b28e59e29ded87b0e62216b76030b752389b6a90cacf9cc6e5060a32c"

RPROVIDES:${PN} += "esbuild esbuild(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
