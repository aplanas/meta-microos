SUMMARY = "Python bindings for the Stripe API"
DESCRIPTION = "Python bindings for the Stripe API."
LICENSE = "MIT"

PV = "2.63.0"

RPM_NAME = "python39-stripe-2.63.0-1.10.noarch.rpm"
RPM_HASH = "298247d0867f67be25f49ae4837795df29d85dbc9f0d1b0184bb8c85f9b76f7e1ba7c9eb5da3ba86eaeed2971b5ad4ecc0e1caa074e18c1b2517ee9a02293dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-stripe \
python39-stripe \
python3dist-stripe"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
