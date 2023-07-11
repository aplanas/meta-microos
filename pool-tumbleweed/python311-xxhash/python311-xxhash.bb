SUMMARY = "Python binding for xxHash"
DESCRIPTION = "xxhash is a Python binding for the xxHash library."
LICENSE = "BSD-2-Clause"

PV = "3.1.0"

RPM_NAME = "python311-xxhash-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "844071dac9d5eea02303a19201f5b06f5a7584849fbbc3cca37dda0afd40cedce79bc33e0234859e3fe32c22a18f2ba02f1cb8ad140cc8e23d288aca891acbc8"

RPROVIDES:${PN} += "python3-xxhash \
python3.11dist-xxhash \
python311-xxhash \
python3dist-xxhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxxhash.so.0 \
python-abi"

inherit rpm
