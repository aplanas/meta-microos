SUMMARY = "Pluggable transport proxy for Tor"
DESCRIPTION = "A tool that attempts to circumvent censorship by transforming the Tor traffic \
between the client and the bridge. This way censors, who usually monitor traffic \
between the client and the bridge, will see innocent-looking transformed traffic \
instead of the actual Tor traffic."
LICENSE = "BSD-2-Clause & GPL-3.0-only"

PV = "0.0.13"

RPM_NAME = "obfs4-0.0.13-1.10.aarch64.rpm"
RPM_HASH = "8b8efab81c4ce1e5c7d942ef1d72e2f6a6c780f5cb9fef8eff4fa8eb46d3b38512af61f8d707312dc22715308d053e2e76e199273129b9f76c8b44521fb7fb5c"

RPROVIDES:${PN} += "obfs4"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
