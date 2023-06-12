SUMMARY = "Pluggable transport proxy for Tor"
DESCRIPTION = "A tool that attempts to circumvent censorship by transforming the Tor traffic \
between the client and the bridge. This way censors, who usually monitor traffic \
between the client and the bridge, will see innocent-looking transformed traffic \
instead of the actual Tor traffic."
LICENSE = "BSD-2-Clause & GPL-3.0-only"

PV = "0.0.13"

RPM_NAME = "obfs4-0.0.13-1.9.aarch64.rpm"
RPM_HASH = "92db0fe4a631ede94aaea606cd49e2ec62a099d1104bbe37f59173df40e6769c2bceaee49bff65d705076b637a972d9b51c4c3d339272302471187ad051dfbc0"

RPROVIDES:${PN} += "obfs4 \
obfs4(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
