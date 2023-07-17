SUMMARY = "Network UPS Tools - Documentation in AsciiDoc Format"
DESCRIPTION = "NUT manuals in AsciiDoc format (human readable source). \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-doc-asciidoc-2.8.0-4.1.noarch.rpm"
RPM_HASH = "6cae74c9bf3ad5820e13d646186c502767ae83efd93709e813d47da2be7d4802a13282cce815d81a62b5e797a0747025a4126488967927a1555113f716c5abce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-asciidoc"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
