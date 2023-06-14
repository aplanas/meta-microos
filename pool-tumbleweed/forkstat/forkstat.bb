SUMMARY = "Process fork/exec/exit monitoring tool"
DESCRIPTION = "Forkstat monitors process fork(), exec() and exit() activity. It is useful for \
monitoring system behaviour and to track down rogue processes that are spawning \
off processes and potentially abusing the system."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.01"

RPM_NAME = "forkstat-0.03.01-1.2.aarch64.rpm"
RPM_HASH = "31429db39c38a4ac5ea770eb551b34da3294f2854cd412799e97df849010255e2a248eda26edba170a321d257335407e7392e565d185cb4376a98ec7b13bc999"

RPROVIDES:${PN} += "forkstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
