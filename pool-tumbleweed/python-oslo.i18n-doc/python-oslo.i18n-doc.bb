SUMMARY = "Documentation for OpenStack i18n library"
DESCRIPTION = "Documentation for the oslo.i18n library."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python-oslo.i18n-doc-6.0.0-2.1.noarch.rpm"
RPM_HASH = "f8edc1dddf67c5062699a9b49507de66129a8dd5d2bfd84818f8994e4b59afe16bab9b38119f137728e27a25381a104b10ac7a2563f7cf02447bae2e803e6e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.i18n-doc"

RDEPENDS:${PN} += ""

inherit rpm
