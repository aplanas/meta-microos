SUMMARY = "A JavaScript bundler written for speed"
DESCRIPTION = "esbuild is a JavaScript bundler and minifier. \
 \
%{gopkg}"
LICENSE = "MIT"

PV = "0.18.2"

RPM_NAME = "esbuild-0.18.2-1.1.aarch64.rpm"
RPM_HASH = "f2fc90bae7e1b8daeec0e4bfb98b8c085b04386ea39a330f08f882dcf4ee6c1a9a3ae1686b81a0164f112574fdf4682482c2683acc6e374d5d0ddd17afa3495d"

RPROVIDES:${PN} += "esbuild"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
