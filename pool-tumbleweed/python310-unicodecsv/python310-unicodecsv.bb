SUMMARY = "Drop-in replacment for python's csv module with unicode support"
DESCRIPTION = "Python 2's csv module doesn't easily deal with unicode strings, \
leading to the dreaded ''ascii' codec can't encode characters \
in position ...' exception. \
 \
The unicodecsv is a drop-in replacement for Python 2's csv module \
which supports unicode strings without a hassle."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "python310-unicodecsv-0.14.1-2.21.noarch.rpm"
RPM_HASH = "2f4b7774a9faaf1a91aa574770c9711fa6936144a7d8274513f25418681e3d299ce27ec0beef608ec11bfed0633042235d7168d1350b2a239bf5d5dba4fa1a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unicodecsv \
python310-unicodecsv \
python3dist-unicodecsv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
