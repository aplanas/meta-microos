SUMMARY = "Stateful programmatic web browsing"
DESCRIPTION = "Stateful programmatic web browsing in Python. Browse pages \
programmatically with HTML form filling and clicking \
of links."
LICENSE = "BSD-3-Clause & (BSD-3-Clause | ZPL-2.1)"

PV = "0.4.8"

RPM_NAME = "python311-mechanize-0.4.8-5.2.noarch.rpm"
RPM_HASH = "c01e6b6313b93eedb018ae0b7351205d17c01354df5699c64d61fa58653e1f809c92f9b5522c4c7da9624317ceed324292d4d6fde7c9a2c377ab77ff860b8640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mechanize) \
python311-mechanize \
python3dist(mechanize)"

RDEPENDS:${PN} += "python(abi) \
python311-html5lib"

inherit rpm
