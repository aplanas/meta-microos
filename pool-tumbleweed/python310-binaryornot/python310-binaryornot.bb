SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text, \
using a heuristic similar to Perl's pp_fttext and its analysis \
by eliben."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python310-binaryornot-0.4.4-4.3.noarch.rpm"
RPM_HASH = "829aeaaacb134e7c53b97ae03cbe17792bf3737776b357b6d9b38904c989aed1a48c4adb831345c32d993daf9ffde44f8f13ddd3a2cb850b71e4b0595f6116aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-binaryornot \
python310-binaryornot \
python3dist-binaryornot"

RDEPENDS:${PN} += "python-abi \
python310-chardet"

inherit rpm
