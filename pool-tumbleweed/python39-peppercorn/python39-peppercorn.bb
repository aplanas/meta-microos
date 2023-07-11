SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python39-peppercorn-0.6-4.3.noarch.rpm"
RPM_HASH = "6ba43ec8bcc62eb7d3d3aaf82358ab2480a3e64fd974d784400aaadb6215a6419cd0c10097e30cd361bf7943216b53f24dc6192b90f95c465653c7abbbb35202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-peppercorn \
python39-peppercorn \
python3dist-peppercorn"

RDEPENDS:${PN} += "python-abi"

inherit rpm
