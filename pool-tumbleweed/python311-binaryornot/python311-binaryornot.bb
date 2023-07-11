SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text, \
using a heuristic similar to Perl's pp_fttext and its analysis \
by eliben."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python311-binaryornot-0.4.4-4.3.noarch.rpm"
RPM_HASH = "f642dac0aec794608092b8f178433ed29e25ff53d67a4c9141f944534547798e6b5522890b26a31b4e6b9d31c52c7d5711d57db09628309f0f0af1c52309fcd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-binaryornot \
python3.11dist-binaryornot \
python311-binaryornot \
python3dist-binaryornot"

RDEPENDS:${PN} += "python-abi \
python311-chardet"

inherit rpm
