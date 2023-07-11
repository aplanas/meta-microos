SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python310-peppercorn-0.6-4.3.noarch.rpm"
RPM_HASH = "5f73a201107619e08f0b11f33abc6e05339762fc413af12ec86b940633a49e7d21e3dc6979426ea056ef82a4d1606ff5c50202b1568b2231c030900ba4833849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-peppercorn \
python310-peppercorn \
python3dist-peppercorn"

RDEPENDS:${PN} += "python-abi"

inherit rpm
