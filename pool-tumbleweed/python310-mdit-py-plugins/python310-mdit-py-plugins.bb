SUMMARY = "Collection of plugins for markdown-it-py"
DESCRIPTION = "Collection of core plugins for markdown-it-py."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-mdit-py-plugins-0.3.0-3.3.noarch.rpm"
RPM_HASH = "3cc2427ee10fa5c722fd4484e20102dc2e8371d04752006e65d443aa48764c21cc96ef8f8c0a795ae40cf52536bcdc08d4dfa6e68d9425d1e90ca69df0e627ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mdit-py-plugins \
python310-mdit-py-plugins \
python3dist-mdit-py-plugins"

RDEPENDS:${PN} += "python-abi \
python310-markdown-it-py"

inherit rpm
