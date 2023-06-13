SUMMARY = "Verdict header files"
DESCRIPTION = "This package contains the header files and cmake config files."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "verdict-devel-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "88b8fca37930d19c570febe64734d61ec9a40ed132fd006c4d02e170796df0f8ca3b4b83391db00fced6ad51fbc70c7ef0973d075c921670b787d679c6ead76b"

RPROVIDES:${PN} += "cmake(Verdict) \
verdict-devel \
verdict-devel(aarch-64)"

RDEPENDS:${PN} += "libverdict1_4"

inherit rpm
