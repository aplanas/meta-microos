SUMMARY = "Utility to add susedata to repomd metadata"
DESCRIPTION = "This utility scans repodata and adds susedata and EULAs where needed."
LICENSE = "GPL-2.0-only"

PV = "0.3.7"

RPM_NAME = "instsource-susedata-0.3.7-1.6.noarch.rpm"
RPM_HASH = "ed1f9b1e28d7440ec8c8a9794c469c335503e1aa871704d9926a1ecee687ae5c7675b8953965e5306eb391f2562d165d4fde61aac8a436d24f9c68b15d918d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "instsource-susedata"

RDEPENDS:${PN} += "/usr/bin/perl \
inst-source-utils \
package-EULAs \
perl-Locale--gettext \
perl-URI--Escape \
perl-XML--Structured"

inherit rpm
