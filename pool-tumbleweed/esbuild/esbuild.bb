SUMMARY = "A JavaScript bundler written for speed"
DESCRIPTION = "esbuild is a JavaScript bundler and minifier. \
 \
%{gopkg}"
LICENSE = "MIT"

PV = "0.18.12"

RPM_NAME = "esbuild-0.18.12-1.1.aarch64.rpm"
RPM_HASH = "5112498c804d5f30e40baeb26db03488c11e2576b67ad539f9af5935a985d6a606d1049395febc9185f847ea0c6d3c5e2d2dbccd79315fb013e4f5c851177abf"

RPROVIDES:${PN} += "esbuild"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
