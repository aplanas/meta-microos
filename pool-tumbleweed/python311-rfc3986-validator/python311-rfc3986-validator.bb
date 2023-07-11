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

RPM_NAME = "python311-rfc3986-validator-0.1.1-2.3.noarch.rpm"
RPM_HASH = "ec754ae305084fb5baf3fe0beff957eb6fac8ba4601c773a25d6099b22e727e65f5e2098ca24e4421777d13275d85a1db807ce11f9b424f3d679d7bb2edf3a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3986-validator \
python3.11dist-rfc3986-validator \
python311-rfc3986-validator \
python3dist-rfc3986-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
