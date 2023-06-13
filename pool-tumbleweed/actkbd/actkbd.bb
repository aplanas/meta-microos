SUMMARY = "A keyboard shortcut daemon"
DESCRIPTION = "actkbd is a daemon that reacts to user defined keys and launches specific \
commands. It can be used to utilize multimedia keys on simple setups, or \
assigned custom actions to rarely used keys."
LICENSE = "GPL-2.0-only"

PV = "0.2.8"

RPM_NAME = "actkbd-0.2.8-6.2.aarch64.rpm"
RPM_HASH = "151324968acf28d5911ae09fed01b89e1334e5964cb482832a9fc82e893909e90da581c78432c07c31107628630544a6e9242597cc01db6b71618fbf629c4de2"

RPROVIDES:${PN} += "actkbd \
actkbd(aarch-64) \
config(actkbd)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
