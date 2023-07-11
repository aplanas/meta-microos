SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-xml-2.0.2-4.1.noarch.rpm"
RPM_HASH = "6b814ea38ec6f206e55822bbc0d05f6d35e42ffd071da86edf8691da6d5f6672cf9b0285831e3c12cf31888e75bfd3ec30a064c49e89a93201f70238019e0180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-xml \
python311-pandas-xml"

RDEPENDS:${PN} += "python311-lxml \
python311-pandas"

inherit rpm
