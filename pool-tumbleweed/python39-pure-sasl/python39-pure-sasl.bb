SUMMARY = "Pure Python client SASL implementation"
DESCRIPTION = "This package provides a reasonably high-level SASL client written \
in pure Python.  New mechanisms may be integrated easily, but by default, \
support for PLAIN, ANONYMOUS, CRAM-MD5, DIGEST-MD5, and GSSAPI are \
provided."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-pure-sasl-0.6.2-1.15.noarch.rpm"
RPM_HASH = "1a8af4e5a8bdfc120b69f4e43042424f07deff42c1e6edf811100c11b0430da09fee828c2e40422200f27f8fbb64aa115a314184f9c3bf2eff20cffd76cceb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pure-sasl \
python39-pure-sasl \
python3dist-pure-sasl"

RDEPENDS:${PN} += "python-abi \
python39-kerberos"

inherit rpm
