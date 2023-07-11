SUMMARY = "Documentation for ucblogo - a free logo interpreter"
DESCRIPTION = "This package provides additional documentation for ucblogo."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.4"

RPM_NAME = "ucblogo-doc-6.2.4-1.3.noarch.rpm"
RPM_HASH = "1da27deaeecab7a5618c8d2df72eb6d4decc2c544f2a48d74a408b50633c72552b48e5f71c305fae7d3cd92ac3c5b96ae9e77303d44e62a636101b4a3b7b54bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ucblogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
