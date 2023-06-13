SUMMARY = "Web server and API provider for Hawk"
DESCRIPTION = "This package contains the Hawk API server"
LICENSE = "GPL-3.0-or-later"

PV = "0.0.4+git.1604696958.cd5cdf1"

RPM_NAME = "hawk-apiserver-0.0.4+git.1604696958.cd5cdf1-1.1.aarch64.rpm"
RPM_HASH = "6206718b5f9b8ebbff472b0c4718cd2fc38bd4c024c3c344321711d7663f64d318b4ecb70c895d455706586a51dd129aab5f48be28d7d800af11f8a95e2816a0"

RPROVIDES:${PN} += "hawk-apiserver \
hawk-apiserver(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcib.so.27()(64bit) \
libcrmcommon.so.34()(64bit) \
libglib-2.0.so.0()(64bit) \
pacemaker"

inherit rpm
