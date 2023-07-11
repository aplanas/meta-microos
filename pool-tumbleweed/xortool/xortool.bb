SUMMARY = "A tool to analyze multi-byte xor cipher"
DESCRIPTION = "A tool to do some xor analysis: \
 * Guess the key length (based on count of equal chars). \
 * Guess the key (base on knowledge of most frequent char)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "xortool-1.0.0-2.1.noarch.rpm"
RPM_HASH = "f45aca6208a7ca889237458bab684d015198c932b03f85d4ec66ce18e707264ed5594548a9ee406d89c38acda5c09729dc22c4b03e24b787a32dfca8ab6c29ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-xortool \
python3dist-xortool \
xortool"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.11 \
python-abi \
python3-docopt"

inherit rpm
