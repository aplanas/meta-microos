SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-charset-normalizer-3.2.0-1.1.noarch.rpm"
RPM_HASH = "4b4c53c6bb10ea4a2e0ed24439a893043ad9c23e41b6a8182b6a2f22becd9d15c59741cbc0d85f3f0ade799d1bded6681b573de565d2682fba7be0d91eefb529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-charset-normalizer \
python3.11dist-charset-normalizer \
python311-charset-normalizer \
python3dist-charset-normalizer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
