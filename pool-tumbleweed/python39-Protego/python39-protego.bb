SUMMARY = "Pure-Python robotstxt parser with support for modern conventions"
DESCRIPTION = "Protego is a pure-Python `robots.txt` parser with support for modern conventions."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python39-Protego-0.2.1-2.5.noarch.rpm"
RPM_HASH = "57bb9a8857ba3826e2944c3e5e6428854574a8d4ea77b29858d834e4dea84039d54a2a5e33212aab904068d45fe37078e295b6ea6f568c403eaa1874646f1d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-protego \
python39-Protego \
python3dist-protego"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
