SUMMARY = "Python extension computing string distances and similarities"
DESCRIPTION = "The Levenshtein Python C extension module contains functions for fast \
computation of \
 \
 * Levenshtein (edit) distance, and edit operations \
 * string similarity \
 * approximate median strings, and generally string averaging \
 * string sequence and set similarity \
 \
It supports both normal and Unicode strings."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.0"

RPM_NAME = "python39-Levenshtein-0.12.0-4.21.aarch64.rpm"
RPM_HASH = "f87e358b83e9329bc32fcf132cc6c5f0cffcfb366e6bb62a328aa2c4f08cc0aeed33f7561832b4d2dbde0192ba4024e79151b04f18168dc576ff64eea47f6ad3"

RPROVIDES:${PN} += "python3.9dist-python-levenshtein \
python39-Levenshtein \
python3dist-python-levenshtein"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
