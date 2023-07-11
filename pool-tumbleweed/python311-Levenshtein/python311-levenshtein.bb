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

RPM_NAME = "python311-Levenshtein-0.12.0-4.21.aarch64.rpm"
RPM_HASH = "02be27c767bb405559f76ae8e1de64a28ce8d37d928dd0ba91324f85f1fac5c564c6e63246330012e107dd6a20947a44361dbc83a38096f74a2ce9ebba3d9b02"

RPROVIDES:${PN} += "python3-Levenshtein \
python3.11dist-python-levenshtein \
python311-Levenshtein \
python3dist-python-levenshtein"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
