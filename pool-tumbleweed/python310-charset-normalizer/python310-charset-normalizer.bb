SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-charset-normalizer-3.1.0-2.1.noarch.rpm"
RPM_HASH = "0892fbb2fefbb180f8a68acc88e6e1f3f7eb02bd7ca204cf1ffa6723038968889c8d6da2c1361ed8b717bbb267d5d05d9c422ddcbeafe5fd272e0dcd7f3aa526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-charset-normalizer \
python3.10dist(charset-normalizer) \
python310-charset-normalizer \
python3dist(charset-normalizer)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
