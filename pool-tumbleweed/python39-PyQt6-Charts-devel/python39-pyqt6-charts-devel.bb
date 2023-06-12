SUMMARY = "Devel files for python39-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-Charts-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "4f92b5a4ef3db161017ce13d2eda1ff41bcc2a3becef4af613a6a764098b471a65476b6ced8df52ca0d861a43c003d2721a870ee4755295456c9b52787453c43"

RPROVIDES:${PN} += "python39-PyQt6-Charts-devel \
python39-PyQt6-Charts-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python39-PyQt6-devel"

inherit rpm
