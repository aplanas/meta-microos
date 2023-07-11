SUMMARY = "Python module to allow customization of the process title"
DESCRIPTION = "Changing the title is mostly useful in multi-process systems, for example when \
a master process is forked: changing the children's title allows to identify \
the task each process is busy with. The technique is used by PostgreSQL  and \
the OpenSSH Server for example."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python310-setproctitle-1.3.2-1.6.aarch64.rpm"
RPM_HASH = "ef0f225709598a326c0afc6379cdd116d60982ea5755f031ec5d3e40f5c514a841ad9b82c70fea7e43031ec5d9864bd5e523ed0b5d7cac449c40ee6490de9fc5"

RPROVIDES:${PN} += "python3.10dist-setproctitle \
python310-setproctitle \
python3dist-setproctitle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
