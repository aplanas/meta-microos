SUMMARY = "Python bindings for Augeas"
DESCRIPTION = "Python bindings for Augeas, a library for programmatically editing \
configuration files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "python311-augeas-1.1.0-1.1.noarch.rpm"
RPM_HASH = "bb91889e13efb30a3855d43cf2fdbfc8d8c2363861efc01d769fd1dcf3629ff34acb1342e93617a463a7ca91b9b13c68e483927fc102752e6f023f036bfb40fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-augeas \
python3.11dist-python-augeas \
python311-augeas \
python3dist-python-augeas"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
python-abi"

inherit rpm
