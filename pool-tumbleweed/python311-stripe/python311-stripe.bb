SUMMARY = "Python bindings for the Stripe API"
DESCRIPTION = "Python bindings for the Stripe API."
LICENSE = "MIT"

PV = "2.63.0"

RPM_NAME = "python311-stripe-2.63.0-1.8.noarch.rpm"
RPM_HASH = "a42f285ea20a1e23e539978bb3595633cf478df9e466a93c0e5797f375bf852daa72019e01c0e2686a9b437692c67ed1b924f3e435eb86d1de38ed572e72bf2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(stripe) \
python311-stripe \
python3dist(stripe)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
