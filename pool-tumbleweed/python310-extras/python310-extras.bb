SUMMARY = "Extra bits for Python"
DESCRIPTION = "extras is a set of extensions to the Python standard library, originally \
written to make the code within testtools cleaner, but now split out for \
general use outside of a testing context."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-extras-1.0.0-6.1.noarch.rpm"
RPM_HASH = "9ea20ede4ed2f56384239f6a6cf61c9ac982bc358a5da115a5f98a5ed139f6e53339a53d5bed5c0806582fc9305845cc2da969a17dc645256898b1f1c5f4f805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extras \
python3.10dist(extras) \
python310-extras \
python3dist(extras)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
