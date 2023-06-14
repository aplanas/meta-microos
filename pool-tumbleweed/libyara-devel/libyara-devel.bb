SUMMARY = "Development files to support the yara malware identification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.0"

RPM_NAME = "libyara-devel-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "a8694af808e1bc013cd7da287ab04ad6810c21a1fd8222d4aff7ef09bbe3ae37edb560fd5db83939ba0e736212f530b7506fe3250fe7ed28dd450889e884500c"

RPROVIDES:${PN} += "libyara-devel \
pkgconfig-yara"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyara10 \
pkgconfig-jansson"

inherit rpm
