SUMMARY = "Okta login without API token"
DESCRIPTION = "This modules provides a way for scripts to access resources behind \
an Okta SSO solution, without the need for an API token."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-oktaloginwrapper-0.2.2-2.9.noarch.rpm"
RPM_HASH = "c92019cb9a4e1fd50d2ff679fa636ee3c35cbefaa65e352fb037de0045526bd4e46eacf1a4b60938e81a2be539a5be5c30a4b61dbe364e8744d67e697e53030a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oktaloginwrapper \
python39-oktaloginwrapper \
python3dist-oktaloginwrapper"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-requests"

inherit rpm
