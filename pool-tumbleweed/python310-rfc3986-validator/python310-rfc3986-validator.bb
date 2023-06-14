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

RPM_NAME = "python310-rfc3986-validator-0.1.1-2.1.noarch.rpm"
RPM_HASH = "901bf5e0e97d0265fbf8dbeccfed9d2523dd0f7f2f8503c39d7a9eb9ca3eea641ef7048598cbae3c32591e263bbe75f91e685000371f2dba70bdca101cfd37ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3986-validator \
python3.10dist-rfc3986-validator \
python310-rfc3986-validator \
python3dist-rfc3986-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
