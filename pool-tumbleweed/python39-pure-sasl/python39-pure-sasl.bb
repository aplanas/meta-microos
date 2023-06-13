SUMMARY = "Pure Python client SASL implementation"
DESCRIPTION = "This package provides a reasonably high-level SASL client written \
in pure Python.  New mechanisms may be integrated easily, but by default, \
support for PLAIN, ANONYMOUS, CRAM-MD5, DIGEST-MD5, and GSSAPI are \
provided."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-pure-sasl-0.6.2-1.14.noarch.rpm"
RPM_HASH = "39548076ad8cd771e1936f7897b36a7d78c01af0977e31e36d1e6ef78b936a88cafd1ff9b8319bf742b3106ac4bcbb000512471bfc66dfffba16febceff0e759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pure-sasl) \
python39-pure-sasl \
python3dist(pure-sasl)"

RDEPENDS:${PN} += "python(abi) \
python39-kerberos"

inherit rpm
