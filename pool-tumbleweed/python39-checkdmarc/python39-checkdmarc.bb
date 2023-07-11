SUMMARY = "A Python module and command line parser for SPF and DMARC records"
DESCRIPTION = "A Python module and command line parser for SPF and DMARC records."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "python39-checkdmarc-4.4.1-1.10.noarch.rpm"
RPM_HASH = "cf67e3aca4915edb3548d9f8a09928fb7d6c262bfc8e12f1ae1017e2af4e59b01a28543d6465330fd8c3819ad4332c20372066a5b6a21743e97afd8d4f12f782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-checkdmarc \
python39-checkdmarc \
python3dist-checkdmarc"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dnspython \
python39-expiringdict \
python39-publicsuffix2 \
python39-pyleri \
python39-requests \
python39-timeout-decorator"

inherit rpm
