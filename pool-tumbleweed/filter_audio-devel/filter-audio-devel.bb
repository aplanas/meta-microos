SUMMARY = "Development headers for filter_audio"
DESCRIPTION = "An audio filtering library made from WebRTC code. \
 \
This package provides development headers for filter_audio."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "filter_audio-devel-0.0.1-2.14.aarch64.rpm"
RPM_HASH = "7df7bffdd6afd1173417bae92a94bd341b186e9cf1a72af4c29d51fe995bfd417e291064baf931fc5c758e9a5f91bad4b487323f115a661b21a8007b0dbc6c23"

RPROVIDES:${PN} += "filter_audio-devel \
filter_audio-devel(aarch-64) \
pkgconfig(filteraudio)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfilteraudio0"

inherit rpm
