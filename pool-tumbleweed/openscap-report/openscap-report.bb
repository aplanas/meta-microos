SUMMARY = "A tool for generating human-readable reports from (SCAP) XCCDF and ARF results"
DESCRIPTION = "This package provides a command-line tool for generating \
human-readable reports from SCAP XCCDF and ARF results."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT & SUSE-Public-Domain"

PV = "0.2.2"

RPM_NAME = "openscap-report-0.2.2-1.1.noarch.rpm"
RPM_HASH = "64eaab5a3fc9689bce09cf44ee6bb16116c23a62e1562d6fff02db77bd9eab50ba26591a1b251ff595b72b5a06f832b2fdd201191e3065ec091a679afacba370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled(patternfly) \
openscap-report \
python3.10dist(openscap-report) \
python3dist(openscap-report)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-Jinja2 \
python3-lxml"

inherit rpm
