SUMMARY = "Pure python rfc3986 validator"
DESCRIPTION = "A pure python rfc3986 validator \
 \
Usage: \
    >>> from rfc3986_validator import validate_rfc3986 \
    >>> validate_rfc3986('http://foo.bar?q=Spaces should be encoded') \
    False \
 \
    >>> validate_rfc3986('http://foo.com/blah_blah_(wikipedia)') \
    True"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-rfc3986-validator-0.1.1-2.3.noarch.rpm"
RPM_HASH = "d8ab085a20f7568e7e5d4cff890a31e2d3cd3a99a0d4087ad2fe8301f36c13336b7d92a61ea5772429ee331c8a91d5a2f415f94953887c1ed705179ed4a3377f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rfc3986-validator \
python310-rfc3986-validator \
python3dist-rfc3986-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
