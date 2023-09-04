SUMMARY = "A JavaScript bundler written for speed"
DESCRIPTION = "esbuild is a JavaScript bundler and minifier. \
 \
%{gopkg}"
LICENSE = "MIT"

PV = "0.19.1"

RPM_NAME = "esbuild-0.19.1-1.1.aarch64.rpm"
RPM_HASH = "e36ca069d51c3b8b1414e9a8f75f7650d8ba125b5ac0db49c4b981447c1558d8b9d50c38672c3ecdd9b96e3b9212cbdae5cc92f83bf50dc61c0b0d4bb0bf75ad"

RPROVIDES:${PN} += "esbuild"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
