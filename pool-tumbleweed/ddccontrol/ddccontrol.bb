SUMMARY = "A tool to configure monitor settings via DDC/CI"
DESCRIPTION = "ddccontrol allows to change monitor settings, such as brightness and \
contrast, without using the monitor's hardware buttons."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2+20140105+git9d89d8c"

RPM_NAME = "ddccontrol-0.4.2+20140105+git9d89d8c-4.14.aarch64.rpm"
RPM_HASH = "66aa3a8778fded9322717bf65b52e3997079143fd93be0897ac4f840e84cb4d1b69797391f11ba65740ed30e192ec831d915b1aa060964650cf8b55cf1e27fa8"

RPROVIDES:${PN} += "ddccontrol"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libddccontrol.so.0"

inherit rpm
