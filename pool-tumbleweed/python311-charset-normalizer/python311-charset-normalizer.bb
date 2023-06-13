SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-charset-normalizer-3.1.0-2.1.noarch.rpm"
RPM_HASH = "4baa89225c839d56ef485ff18be7d2dfddfa8e238d234e2777fcdb1ff4e53627a0458b5cb235f3cb4398ed96be11ef9f0f6483455aad78b969c17bc79350fc57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(charset-normalizer) \
python311-charset-normalizer \
python3dist(charset-normalizer)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
