SUMMARY = "A Python module and command line parser for SPF and DMARC records"
DESCRIPTION = "A Python module and command line parser for SPF and DMARC records."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "python311-checkdmarc-4.4.1-1.8.noarch.rpm"
RPM_HASH = "64690d78af26e2a3be83bba963f2880700ba4c841c9d0ab7180baeeed6676ff310fe7e2ca488237f5a759a0c8c1688ba301871472b8738c471f4d7fccc61e8fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(checkdmarc) \
python311-checkdmarc \
python3dist(checkdmarc)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-dnspython \
python311-expiringdict \
python311-publicsuffix2 \
python311-pyleri \
python311-requests \
python311-timeout-decorator"

inherit rpm
