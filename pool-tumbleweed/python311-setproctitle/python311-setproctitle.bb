SUMMARY = "Python module to allow customization of the process title"
DESCRIPTION = "Changing the title is mostly useful in multi-process systems, for example when \
a master process is forked: changing the children's title allows to identify \
the task each process is busy with. The technique is used by PostgreSQL  and \
the OpenSSH Server for example."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python311-setproctitle-1.3.2-1.6.aarch64.rpm"
RPM_HASH = "ec1f4d6822f6437f1ad0aef1da068e463b40dffd195b9a274ddd8acc2ebb54b69257416f2ac4421292e8a60e4ebecad41ad314dd235eb63ad2b2dfb4837d53ee"

RPROVIDES:${PN} += "python3-setproctitle \
python3.11dist-setproctitle \
python311-setproctitle \
python3dist-setproctitle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
