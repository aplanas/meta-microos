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

RPM_NAME = "python39-rfc3986-validator-0.1.1-2.1.noarch.rpm"
RPM_HASH = "75d3a3282ea852c774134c64ae20c9812a680becb7c5cba487797f9f006ec64ba93d4176afb47a208cf082ebbdce22cd0c97a7bf3678b8be45580512361283cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rfc3986-validator) \
python39-rfc3986-validator \
python39-rfc3986_validator \
python3dist(rfc3986-validator)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
