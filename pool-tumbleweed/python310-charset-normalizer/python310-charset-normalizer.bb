SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-charset-normalizer-3.2.0-1.1.noarch.rpm"
RPM_HASH = "3dc3e055997088c0153dbf0571b3221a8f94e73f39ac90096d5cd6be5e1e3bf082b50492ab03479cc9a616cd4980f0252538fa407bb0fcc8537900422c9383b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-charset-normalizer \
python310-charset-normalizer \
python3dist-charset-normalizer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
