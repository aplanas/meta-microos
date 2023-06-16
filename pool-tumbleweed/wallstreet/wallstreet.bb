SUMMARY = "Program to fill the console with Wall Street-like news and stats"
DESCRIPTION = "This utility will split the console into a multiple panes of news \
and statistics, like any good computer screen on Wall Street."
LICENSE = "Apache-2.0"

PV = "1.21"

RPM_NAME = "wallstreet-1.21-3.6.noarch.rpm"
RPM_HASH = "da56f9c33c20e27b927ad5a8eda3ce7ba44ef58b3f7c146f102cbec53ab4e7d3fc79728b4d8da7ba83e382ca7aca0c69c3160eb08580b79be36d37068b756fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wallstreet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
perl-base \
wget"

inherit rpm
