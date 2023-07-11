SUMMARY = "Email reply parser"
DESCRIPTION = "Email reply parser."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "python39-email-reply-parser-0.5.12-1.9.noarch.rpm"
RPM_HASH = "e7fa188a2623e3cd8f096deae9f1e6bb1efddd33b6f4284536628cdac3785b72fbe5cab40d91f310bab8c0dd7af6406ee2ae9aea2ae65d83da045c93afc7e850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-email-reply-parser \
python39-email-reply-parser \
python3dist-email-reply-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
