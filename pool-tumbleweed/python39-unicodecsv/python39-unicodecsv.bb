SUMMARY = "Drop-in replacment for python's csv module with unicode support"
DESCRIPTION = "Python 2's csv module doesn't easily deal with unicode strings, \
leading to the dreaded ''ascii' codec can't encode characters \
in position ...' exception. \
 \
The unicodecsv is a drop-in replacement for Python 2's csv module \
which supports unicode strings without a hassle."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "python39-unicodecsv-0.14.1-2.21.noarch.rpm"
RPM_HASH = "cdce63d730ff7234143254dd7b468a0df59ee2195ad02c0fdeff5437deed724eec44bc441c6b8d7c8323eb6813e6cafda5fb70e57b613c43fae911fe5446f0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unicodecsv \
python39-unicodecsv \
python3dist-unicodecsv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
