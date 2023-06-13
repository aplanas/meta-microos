SUMMARY = "Email reply parser"
DESCRIPTION = "Email reply parser."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "python311-email-reply-parser-0.5.12-1.8.noarch.rpm"
RPM_HASH = "81ceb1245d149af32b23cfe40d3f371e02de8701d2cb97b8284bdf1e93945a1e53297c42adf6f6fc92d0450f6abcc407a9ff55e4d6d31391c419a615008435c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(email-reply-parser) \
python311-email-reply-parser \
python3dist(email-reply-parser)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
