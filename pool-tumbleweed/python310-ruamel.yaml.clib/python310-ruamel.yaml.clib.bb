SUMMARY = "Python YAML parser c-library"
DESCRIPTION = "ruamel.yaml.clib is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order. \
This package contains the C library counterpart of it."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "python310-ruamel.yaml.clib-0.2.7-2.1.aarch64.rpm"
RPM_HASH = "1935c4a548b5c06ce8b7a313c9446448314b61318ea430163a5655b0824ed6c78075a4707a307b4cd0bf434d6e7ee439628f60cece224bee97c4a3201ac78594"

RPROVIDES:${PN} += "python3-ruamel.yaml.clib \
python3.10dist(ruamel.yaml.clib) \
python310-ruamel.yaml.clib \
python310-ruamel.yaml.clib(aarch-64) \
python3dist(ruamel.yaml.clib)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
