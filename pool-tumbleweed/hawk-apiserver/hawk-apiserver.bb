SUMMARY = "Web server and API provider for Hawk"
DESCRIPTION = "This package contains the Hawk API server"
LICENSE = "GPL-3.0-or-later"

PV = "0.0.4+git.1604696958.cd5cdf1"

RPM_NAME = "hawk-apiserver-0.0.4+git.1604696958.cd5cdf1-1.2.aarch64.rpm"
RPM_HASH = "f20ed73a72ebb8e4aaf663a3591ec61f2f4de1466624012897893ec1a2470ea82009af4cbbc31c3200af5858a82a8062d1d27be916a54c3a0b04d06cc6bcea5f"

RPROVIDES:${PN} += "hawk-apiserver"

RDEPENDS:${PN} += "libc.so.6 \
libcib.so.27 \
libcrmcommon.so.34 \
libglib-2.0.so.0 \
pacemaker"

inherit rpm
