SUMMARY = "Python bindings for the Stripe API"
DESCRIPTION = "Python bindings for the Stripe API."
LICENSE = "MIT"

PV = "2.63.0"

RPM_NAME = "python310-stripe-2.63.0-1.8.noarch.rpm"
RPM_HASH = "4cd56172c7ede7717899682933c7870197ee0b2f3029be58d0592cecc93a577116c34356854cd6b204ae8f7267d9fff5523d24b0488534e4bf9546ed1351e6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stripe \
python3.10dist-stripe \
python310-stripe \
python3dist-stripe"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
