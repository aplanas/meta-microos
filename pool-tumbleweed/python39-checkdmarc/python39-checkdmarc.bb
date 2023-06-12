SUMMARY = "A Python module and command line parser for SPF and DMARC records"
DESCRIPTION = "A Python module and command line parser for SPF and DMARC records."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "python39-checkdmarc-4.4.1-1.8.noarch.rpm"
RPM_HASH = "78d9ccd42651cd5d48f3d18f3d9eca377fe83493a62152d85654f1d5c112ee2bb406f7a6b36f0ab58541966b742a22f632b66184397ec794cb97f8d92d3c2184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(checkdmarc) \
python39-checkdmarc \
python3dist(checkdmarc)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-dnspython \
python39-expiringdict \
python39-publicsuffix2 \
python39-pyleri \
python39-requests \
python39-timeout-decorator"

inherit rpm
