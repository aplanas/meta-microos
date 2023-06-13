SUMMARY = "Drop-in replacment for python's csv module with unicode support"
DESCRIPTION = "Python 2's csv module doesn't easily deal with unicode strings, \
leading to the dreaded ''ascii' codec can't encode characters \
in position ...' exception. \
 \
The unicodecsv is a drop-in replacement for Python 2's csv module \
which supports unicode strings without a hassle."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "python311-unicodecsv-0.14.1-2.19.noarch.rpm"
RPM_HASH = "9b21f1ca85102c79f7a827241ac380ba687c6b9950cfa3f96f9b680c8afddb5e044ac9e91edc00710525edc34439ff4873a3af39fd1ae933646e13a9cb6c089b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(unicodecsv) \
python311-unicodecsv \
python3dist(unicodecsv)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
