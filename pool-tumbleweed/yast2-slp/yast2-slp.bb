SUMMARY = "YaST2 - SLP Agent and Library"
DESCRIPTION = "This package provides YaST modules to lookup/advertise services with SLP."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-slp-4.6.0-1.2.aarch64.rpm"
RPM_HASH = "d70372bb76a73f123f2e052326cb63f2eff396da2e4e30cf6ccde066c2f43386b24310e5b252ff4cd8f6c3bc99cd3b36562905f9aa7a08c0d73affb47d33e4cd"

RPROVIDES:${PN} += "libpy2ag-slp.so.2 \
yast2-slp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libscr.so.3 \
libslp.so.1 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
openslp \
yast2 \
yast2-ruby-bindings"

inherit rpm
