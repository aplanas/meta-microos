SUMMARY = "Pure Python client SASL implementation"
DESCRIPTION = "This package provides a reasonably high-level SASL client written \
in pure Python.  New mechanisms may be integrated easily, but by default, \
support for PLAIN, ANONYMOUS, CRAM-MD5, DIGEST-MD5, and GSSAPI are \
provided."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-pure-sasl-0.6.2-1.15.noarch.rpm"
RPM_HASH = "74a1f3ee26b2a1c3944bfa67be7d5f15a00c7ccef16ee7ffdb478be70305cdec2ae4b7721d5f21178c3c8c5befb1178b6fad602e6f2cf7ab796211de8f4dd3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pure-sasl \
python3.11dist-pure-sasl \
python311-pure-sasl \
python3dist-pure-sasl"

RDEPENDS:${PN} += "python-abi \
python311-kerberos"

inherit rpm
