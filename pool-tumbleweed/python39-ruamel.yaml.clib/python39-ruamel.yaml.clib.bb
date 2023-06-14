SUMMARY = "Python YAML parser c-library"
DESCRIPTION = "ruamel.yaml.clib is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order. \
This package contains the C library counterpart of it."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "python39-ruamel.yaml.clib-0.2.7-2.1.aarch64.rpm"
RPM_HASH = "0cadd6aa85d464e07090a197d23df9fd79b7b365abd4137a6fa24f6772cea0de56059392891478d2dc0a1b8a1900a39a9e042d160ca1def677eaa899817f6fd8"

RPROVIDES:${PN} += "python3.9dist-ruamel.yaml.clib \
python39-ruamel.yaml.clib \
python3dist-ruamel.yaml.clib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
