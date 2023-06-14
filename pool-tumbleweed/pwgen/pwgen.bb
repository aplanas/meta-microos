SUMMARY = "Password generator"
DESCRIPTION = "pwgen generates random, meaningless but pronounceable and thus easy to \
remember passwords. The also contained makepasswd gives even more \
options which are more aimed at security."
LICENSE = "GPL-2.0-or-later"

PV = "2.08"

RPM_NAME = "pwgen-2.08-2.5.aarch64.rpm"
RPM_HASH = "802b96cd632bf78f72f4b5ab20ea9f15645fd6ff504444d2cb3aa951f010c580e0f34170129ba0b73d96f4304fb17c3da941378886f8d361d3b7ec0356b1e141"

RPROVIDES:${PN} += "pwgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
