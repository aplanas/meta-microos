SUMMARY = "HTTP/2 State-Machine based protocol implementation"
DESCRIPTION = "Pure-Python implementation of a HTTP/2 protocol stack. \
It's written from the ground up to be embeddable in whatever program \
you choose to use, ensuring that you can speak HTTP/2 regardless of \
your programming paradigm."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-h2-4.1.0-3.1.noarch.rpm"
RPM_HASH = "a99b3a7d7b3efc3fff6948b76bdcb44a9ea723910a12e3445deaa7fb28900524ec9379bae69118e12d662cbce673c021461e33fd17ca795e76babf211eee3f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(h2) \
python311-h2 \
python3dist(h2)"
RDEPENDS:${PN} += "python(abi) \
python311-hpack \
python311-hyperframe"

inherit rpm
