SUMMARY = "DuckDuckGo from the terminal"
DESCRIPTION = "A cmdline utility to search DuckDuckGo from the terminal. Similar to googler for Google. \
 \
Unlike the web interface, you can specify the number of search results you would like to see per page. It's more convenient than skimming through 30-odd search results per page. The default interface is carefully designed to use minimum space without sacrificing readability."
LICENSE = "GPL-3.0-only"

PV = "2.1"

RPM_NAME = "ddgr-2.1-1.2.noarch.rpm"
RPM_HASH = "214e1b6ee1996922d73d8a2868361167b534f6fcaca6ec37a34ada30b23d6677289e424eb7384f77a4be1e69a511c19d432eae7d1743e7d7107ea28abe358edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddgr"
RDEPENDS:${PN} += "/usr/bin/python3 python3"

inherit rpm
