SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text, \
using a heuristic similar to Perl's pp_fttext and its analysis \
by eliben."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python39-binaryornot-0.4.4-4.3.noarch.rpm"
RPM_HASH = "b07cd19f3c40f0121cbc79bbd55d0718c7a224a9237c6e64bc24779d68b5cdb854a3c857df5053af92512aee30854c3d78d0de53b182f0448c983853bf00d391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-binaryornot \
python39-binaryornot \
python3dist-binaryornot"

RDEPENDS:${PN} += "python-abi \
python39-chardet"

inherit rpm
