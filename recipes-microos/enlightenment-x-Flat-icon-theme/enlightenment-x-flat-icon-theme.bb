SUMMARY = "A freedesktop.org compatible icon theme"
DESCRIPTION = "Setting this icon theme as your application icon theme in enlightenment will \
make all your applications use the same icon set as the enlightenment \
Flat (upstream) theme. \
 \
Icon themes to match the openSUSE Enlightenment themes are also available."
LICENSE = "GPL-3.0-only"

PV = "0.21.0"

RPM_NAME = "enlightenment-x-Flat-icon-theme-0.21.0-30.6.aarch64.rpm"
RPM_HASH = "c44a6f8e67ab2619dff18886ab601e680079ccaaf814deacb76883e7e1c50f5f96ee998de2ac7e221339d58ed38eb4d2e36313690cfc2219fd9fad335772c967"

RPROVIDES:${PN} += "enlightenment-x-Flat-icon-theme enlightenment-x-Flat-icon-theme(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
