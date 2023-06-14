SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python39-peppercorn-0.6-4.1.noarch.rpm"
RPM_HASH = "a04accb08df284b389c1844ab452f886b5af6ceed202b60b97c859f1f46411662b3db5d1fdf6d3b0dc8e0bfafd4952f0829264f2cbbe64274554ab3003666fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-peppercorn \
python39-peppercorn \
python3dist-peppercorn"

RDEPENDS:${PN} += "python-abi"

inherit rpm
