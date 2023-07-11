SUMMARY = "A tool for generating human-readable reports from (SCAP) XCCDF and ARF results"
DESCRIPTION = "This package provides a command-line tool for generating \
human-readable reports from SCAP XCCDF and ARF results."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT & SUSE-Public-Domain"

PV = "0.2.2"

RPM_NAME = "openscap-report-0.2.2-2.1.noarch.rpm"
RPM_HASH = "5f6656a498983d57637cd18e86a43a2bc289db9fd9e4ad95a8b89a3e5157a58b646f5a4997d9c54932eb84e325bd4c1920faf29e98a1cd700c7afabbaf2343d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled-patternfly \
openscap-report \
python3.11dist-openscap-report \
python3dist-openscap-report"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-Jinja2 \
python3-lxml"

inherit rpm
