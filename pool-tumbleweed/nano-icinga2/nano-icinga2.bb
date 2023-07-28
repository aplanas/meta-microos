SUMMARY = "Nano syntax highlighting for icinga2"
DESCRIPTION = "Provides Nano syntax highlighting for icinga2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "nano-icinga2-2.13.8-1.1.aarch64.rpm"
RPM_HASH = "46ff5643a1bab88192afa9ff3aa2e7b54bdbb388287fec2f533add0cbfeb83a07f06f88b898a7ef553a3ca3c737dc981a0d18be7c173b2d11c8d192bf5699f69"

RPROVIDES:${PN} += "nano-icinga2"

RDEPENDS:${PN} += "nano"

inherit rpm
