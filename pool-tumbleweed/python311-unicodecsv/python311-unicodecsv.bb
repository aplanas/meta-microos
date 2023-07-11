SUMMARY = "Drop-in replacment for python's csv module with unicode support"
DESCRIPTION = "Python 2's csv module doesn't easily deal with unicode strings, \
leading to the dreaded ''ascii' codec can't encode characters \
in position ...' exception. \
 \
The unicodecsv is a drop-in replacement for Python 2's csv module \
which supports unicode strings without a hassle."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "python311-unicodecsv-0.14.1-2.21.noarch.rpm"
RPM_HASH = "8bbd47756ca98afd696f001b91e19ac02bec1246c85eb19d994be93ef69feb79fec018c28eeedb691d702a8f901a4df1b3a571e954a7e2c0f9cfbf78278262d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unicodecsv \
python3.11dist-unicodecsv \
python311-unicodecsv \
python3dist-unicodecsv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
