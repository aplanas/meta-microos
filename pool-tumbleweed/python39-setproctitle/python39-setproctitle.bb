SUMMARY = "Python module to allow customization of the process title"
DESCRIPTION = "Changing the title is mostly useful in multi-process systems, for example when \
a master process is forked: changing the children's title allows to identify \
the task each process is busy with. The technique is used by PostgreSQL  and \
the OpenSSH Server for example."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python39-setproctitle-1.3.2-1.6.aarch64.rpm"
RPM_HASH = "9e1ab906fa9a0de4de45a9becaf12d0962f9297e29cf42b90c2034961286037d35ae777d3dbb0adae91c1530387c98574d1239fc8af56e13e20a1d5aa32966d8"

RPROVIDES:${PN} += "python3.9dist-setproctitle \
python39-setproctitle \
python3dist-setproctitle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
