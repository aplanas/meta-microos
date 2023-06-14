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

RPM_NAME = "python311-rfc3986-validator-0.1.1-2.1.noarch.rpm"
RPM_HASH = "fd49cdd2cc33c035f666fd6f1aec7f4b4a1d598da414ec4aef201d10ef57d53a60dcbcbb93ebb3096eb707a325c74a2dd7c1985a7ddf31210c1fc59774d3da60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rfc3986-validator \
python311-rfc3986-validator \
python3dist-rfc3986-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
