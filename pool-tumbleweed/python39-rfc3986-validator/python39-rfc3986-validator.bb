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

RPM_NAME = "python39-rfc3986-validator-0.1.1-2.3.noarch.rpm"
RPM_HASH = "d751994c581e6f6574d43cbbe5d542e83e59300ff0f2ee981b7cd1d29719aab7c068386a58c301d8d64b6d3d75bc76015c27575159cadce3947c71196e85921a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rfc3986-validator \
python39-rfc3986-validator \
python3dist-rfc3986-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
