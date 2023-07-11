SUMMARY = "The 'Boltons' utility package for Python"
DESCRIPTION = "Boltons is a package containing over 160 utility types and functions \
that can be used as a package or independently. Documentation is on \
http://boltons.readthedocs.org."
LICENSE = "BSD-3-Clause"

PV = "21.0.0"

RPM_NAME = "python310-boltons-21.0.0-2.5.noarch.rpm"
RPM_HASH = "997143962126ce2767d848b63c448596a3fd4d3d96c00e2f82de63e5052b6ce78416bd9193996f17765e80909a8b40897d3f749e26595803994abd20fac76ada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-boltons \
python310-boltons \
python3dist-boltons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
