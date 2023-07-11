SUMMARY = "Development files to support the yara malware identification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "libyara-devel-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "6ca660a4847578ee01c19c641ffcbb5b93059c07d7121cee83e502bb810aef401c7040715ec234879ad95509bed0de499dec15fcf5ec7595250c2e005a89f3a7"

RPROVIDES:${PN} += "libyara-devel \
pkgconfig-yara"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyara10 \
pkgconfig-jansson"

inherit rpm
