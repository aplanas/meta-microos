SUMMARY = "M17N engine for fcitx"
DESCRIPTION = "M17N engine for fcitx. It allows input of many languages using the input table maps from m17n-db."
LICENSE = "GPL-2.0+"

PV = "0.2.4"

RPM_NAME = "fcitx-m17n-0.2.4-1.26.aarch64.rpm"
RPM_HASH = "2e559359ba85f2ddb83e1b6c394374ba062978b3d56f0c231fcd5bc4561180559399d12667534a6e57e254ae9d90691a959ebc9e9885d9ace7ff63439df4f35a"

RPROVIDES:${PN} += "fcitx-m17n fcitx-m17n(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig fcitx libc.so.6(GLIBC_2.17)(64bit) libm17n-core.so.0()(64bit) libm17n.so.0()(64bit)"

inherit rpm
