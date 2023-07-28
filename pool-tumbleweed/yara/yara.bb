SUMMARY = "A malware identification and classification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "yara-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "8cef395a0ff5ac7d2e84eb036a6325473a1d5dae899c9e0e1e5705ad6a69213650bcb6cd0b9f3aa52b6474d8039a622866739184a4e9979feb1486e4e61cc10d"

RPROVIDES:${PN} += "yara"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyara.so.10"

inherit rpm
