SUMMARY = "Python bindings for the Stripe API"
DESCRIPTION = "Python bindings for the Stripe API."
LICENSE = "MIT"

PV = "2.63.0"

RPM_NAME = "python310-stripe-2.63.0-1.10.noarch.rpm"
RPM_HASH = "1027d184bb7abcf8ef7a375274ec2a57edaebaf17b8df48a908af4641bc0d83c8d3633b6a25ac42bec2648c0eea9ca718c48d31ba5b6dee04964006d08abaf46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-stripe \
python310-stripe \
python3dist-stripe"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
