SUMMARY = "Pure Python client SASL implementation"
DESCRIPTION = "This package provides a reasonably high-level SASL client written \
in pure Python.  New mechanisms may be integrated easily, but by default, \
support for PLAIN, ANONYMOUS, CRAM-MD5, DIGEST-MD5, and GSSAPI are \
provided."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-pure-sasl-0.6.2-1.14.noarch.rpm"
RPM_HASH = "35bcbad5396e4d77b8e61dd3e38926e4e70e6c67d3ce2225b5145bda04c07c056a6a68acb46344fae6f0ffcf9fba14c30c3599e7f69bf8e6ace1beba6aa27f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pure-sasl \
python3.10dist-pure-sasl \
python310-pure-sasl \
python3dist-pure-sasl"

RDEPENDS:${PN} += "python-abi \
python310-kerberos"

inherit rpm
