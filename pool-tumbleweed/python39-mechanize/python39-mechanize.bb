SUMMARY = "Stateful programmatic web browsing"
DESCRIPTION = "Stateful programmatic web browsing in Python. Browse pages \
programmatically with HTML form filling and clicking \
of links."
LICENSE = "BSD-3-Clause & (BSD-3-Clause | ZPL-2.1)"

PV = "0.4.8"

RPM_NAME = "python39-mechanize-0.4.8-6.1.noarch.rpm"
RPM_HASH = "4102add51f1137891b3e6eedbeed7c7b56184647157530a7314fd846b92db6836d2620327d0b19dca22ed127b9f563c779f7ca9f4af9285e968b7f2a9ec49754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mechanize \
python39-mechanize \
python3dist-mechanize"

RDEPENDS:${PN} += "python-abi \
python39-html5lib"

inherit rpm
