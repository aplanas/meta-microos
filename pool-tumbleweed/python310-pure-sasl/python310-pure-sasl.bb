SUMMARY = "Pure Python client SASL implementation"
DESCRIPTION = "This package provides a reasonably high-level SASL client written \
in pure Python.  New mechanisms may be integrated easily, but by default, \
support for PLAIN, ANONYMOUS, CRAM-MD5, DIGEST-MD5, and GSSAPI are \
provided."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-pure-sasl-0.6.2-1.15.noarch.rpm"
RPM_HASH = "930919ab9d52145d22558a08f1ecdeafe4b029b8bdd3fba11eb7a4e1a36634656f2daa04bfc183150585f8efa730be41242ec7830a075f7d99b41345beeeb787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pure-sasl \
python310-pure-sasl \
python3dist-pure-sasl"

RDEPENDS:${PN} += "python-abi \
python310-kerberos"

inherit rpm
