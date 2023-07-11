SUMMARY = "HTTP/2 State-Machine based protocol implementation"
DESCRIPTION = "Pure-Python implementation of a HTTP/2 protocol stack. \
It's written from the ground up to be embeddable in whatever program \
you choose to use, ensuring that you can speak HTTP/2 regardless of \
your programming paradigm."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-h2-4.1.0-3.3.noarch.rpm"
RPM_HASH = "ae1063f342afd3399e04edb53623b9170f34ac82ad59d79fbe7d4666decfbda6d00f2e0abe75bb9c91df73d03432297d710987e318157cffd3e90481fff2587d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h2 \
python3.11dist-h2 \
python311-h2 \
python3dist-h2"

RDEPENDS:${PN} += "python-abi \
python311-hpack \
python311-hyperframe"

inherit rpm
