SUMMARY = "Stateful programmatic web browsing"
DESCRIPTION = "Stateful programmatic web browsing in Python. Browse pages \
programmatically with HTML form filling and clicking \
of links."
LICENSE = "BSD-3-Clause & (BSD-3-Clause | ZPL-2.1)"

PV = "0.4.8"

RPM_NAME = "python39-mechanize-0.4.8-5.2.noarch.rpm"
RPM_HASH = "59e453c35578143a1ea6e53d530ad2a8763b2cf1965fc547ed27e7d9a04a561c96811816617de941341b201346380ddc7c68910c816ffc2dbbcd22e9c43452f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mechanize \
python39-mechanize \
python3dist-mechanize"

RDEPENDS:${PN} += "python-abi \
python39-html5lib"

inherit rpm
