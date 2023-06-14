SUMMARY = "Okta login without API token"
DESCRIPTION = "This modules provides a way for scripts to access resources behind \
an Okta SSO solution, without the need for an API token."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-oktaloginwrapper-0.2.2-2.8.noarch.rpm"
RPM_HASH = "a8d5fa0b4b98a85ee0d09a4813e2c23f8d1f9e22afdbec7a8593189a8dbee6b0187363f9f9ebdac875e8c89d79c5010246fdb4f656090530ad700e689c987e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oktaloginwrapper \
python3.10dist-oktaloginwrapper \
python310-oktaloginwrapper \
python3dist-oktaloginwrapper"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-requests"

inherit rpm
