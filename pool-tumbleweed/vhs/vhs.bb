SUMMARY = "CLI video recorder"
DESCRIPTION = "VHS records your terminal as videos or gifs for demos."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "vhs-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "9f415837c91c825cd2dbb4c840bb44d5ebad86a002b5142aa8ff235b546bec396e9d84ca31a592a3239a6456465cec81ca4f7ee7238268aece0c95a9e5d33201"

RPROVIDES:${PN} += "vhs"

RDEPENDS:${PN} += "ffmpeg \
libc.so.6 \
ttyd"

inherit rpm
