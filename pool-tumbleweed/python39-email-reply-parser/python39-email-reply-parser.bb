SUMMARY = "Email reply parser"
DESCRIPTION = "Email reply parser."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "python39-email-reply-parser-0.5.12-1.8.noarch.rpm"
RPM_HASH = "f6982e92445e98c82f72691f1fc473ac4c8f68142b8dbb9a35c224821babf887f61ea444788c6d8e54791036fdc93fdbaa7380b6fe615878073c4d8367833e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(email-reply-parser) \
python39-email-reply-parser \
python3dist(email-reply-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
