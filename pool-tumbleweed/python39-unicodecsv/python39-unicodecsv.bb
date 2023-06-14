SUMMARY = "Drop-in replacment for python's csv module with unicode support"
DESCRIPTION = "Python 2's csv module doesn't easily deal with unicode strings, \
leading to the dreaded ''ascii' codec can't encode characters \
in position ...' exception. \
 \
The unicodecsv is a drop-in replacement for Python 2's csv module \
which supports unicode strings without a hassle."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "python39-unicodecsv-0.14.1-2.19.noarch.rpm"
RPM_HASH = "cc8796c084728fd94180d3b6d104aef6e018215c20d8e95d0b106b331f81c6690dbaa86a9f70d825b8570e5c79ef407b612531888b34fe84432f9629cee530f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unicodecsv \
python39-unicodecsv \
python3dist-unicodecsv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
