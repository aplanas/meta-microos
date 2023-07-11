SUMMARY = "CLI video recorder"
DESCRIPTION = "VHS records your terminal as videos or gifs for demos."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "vhs-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "91360154a1d426c77f737217567abb44f7f17018bc3447a39df28cb57b044bd018b951dc486a76e562ca2be723926c853533ce4961d7ea1fd7a68412d35e16fb"

RPROVIDES:${PN} += "vhs"

RDEPENDS:${PN} += "ffmpeg \
libc.so.6 \
ttyd"

inherit rpm
