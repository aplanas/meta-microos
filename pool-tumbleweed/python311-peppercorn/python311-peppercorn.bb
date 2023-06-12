SUMMARY = "Pyramid exceptions logger"
DESCRIPTION = "A library for converting a token stream into a data structure comprised of \
sequences, mappings, and scalars, developed primarily for converting HTTP form \
POST data into a richer data structure."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python311-peppercorn-0.6-4.1.noarch.rpm"
RPM_HASH = "270a15336b70cbd262a4986d7bf72b9a2cac70ea092e6e72cde120c560ac78504a85c705044a5052245fa6c6ba7a0f786d8b9a85f4f25cd59732666334f4440d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(peppercorn) \
python311-peppercorn \
python3dist(peppercorn)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
