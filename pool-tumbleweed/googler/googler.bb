SUMMARY = "Google Search, Google Site Search, Google News from the terminal"
DESCRIPTION = "googler is a power tool to Google (Web & News) and Google Site Search \
from the command-line. It shows the title, URL and abstract for each \
result, which can be directly opened in a browser from the terminal. \
Results are fetched in pages (with page navigation). Supports \
sequential searches in a single googler instance."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.13"

RPM_NAME = "googler-4.3.13-1.1.noarch.rpm"
RPM_HASH = "cf14aae8acf995d02be5d5522e92e5bebfd8aabde2b916c4f8bc1d53c29c787cea049634edc16415e97dff9cdbe45adc4ad9eb446a28d4419c85fe579e105a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "googler"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
