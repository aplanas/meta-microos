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

RPM_NAME = "python39-Levenshtein-0.12.0-4.19.aarch64.rpm"
RPM_HASH = "91111cf9024a7ef2006007199e1db96ab3a4a3a130a293274d395b849e7188753fa8ab0dac6adab7ca9debaddbbf3481221361bdc14b01315286763e9bacff76"

RPROVIDES:${PN} += "python3.9dist-python-levenshtein \
python39-Levenshtein \
python3dist-python-levenshtein"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
