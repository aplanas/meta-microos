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

RPM_NAME = "python310-Levenshtein-0.12.0-4.21.aarch64.rpm"
RPM_HASH = "13a5e350abfb2cd4cd675dedfb50594212013a408a819d3d3c6859e53ee602b5821e32920c7966f7175c7c664e42ecde20a62f548b0d5cca06029b26366bcdff"

RPROVIDES:${PN} += "python3.10dist-python-levenshtein \
python310-Levenshtein \
python3dist-python-levenshtein"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
