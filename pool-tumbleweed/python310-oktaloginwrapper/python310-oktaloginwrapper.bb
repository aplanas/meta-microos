SUMMARY = "Okta login without API token"
DESCRIPTION = "This modules provides a way for scripts to access resources behind \
an Okta SSO solution, without the need for an API token."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-oktaloginwrapper-0.2.2-2.9.noarch.rpm"
RPM_HASH = "74e34f665506eb714b58edec585026c6d28631c0727f15bf66c5366e4e6ad6a30a1b7eb8de0423ff94475621619ebcda74a26ce12d454886b8446ad0a271d32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-oktaloginwrapper \
python310-oktaloginwrapper \
python3dist-oktaloginwrapper"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-requests"

inherit rpm
