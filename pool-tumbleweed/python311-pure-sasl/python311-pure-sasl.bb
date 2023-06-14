SUMMARY = "Pure Python client SASL implementation"
DESCRIPTION = "This package provides a reasonably high-level SASL client written \
in pure Python.  New mechanisms may be integrated easily, but by default, \
support for PLAIN, ANONYMOUS, CRAM-MD5, DIGEST-MD5, and GSSAPI are \
provided."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-pure-sasl-0.6.2-1.14.noarch.rpm"
RPM_HASH = "1bb4942415e6b325a8bc4ff8d354203515c42d3176ffd23432ff671144f73a32754ee19de5bebd38afaa52b02da86b47902db955176d8d81e0fe3ab73a7e4dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pure-sasl \
python311-pure-sasl \
python3dist-pure-sasl"

RDEPENDS:${PN} += "python-abi \
python311-kerberos"

inherit rpm
