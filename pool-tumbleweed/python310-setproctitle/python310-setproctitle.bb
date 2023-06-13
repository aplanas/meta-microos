SUMMARY = "Python module to allow customization of the process title"
DESCRIPTION = "Changing the title is mostly useful in multi-process systems, for example when \
a master process is forked: changing the children's title allows to identify \
the task each process is busy with. The technique is used by PostgreSQL  and \
the OpenSSH Server for example."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python310-setproctitle-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "8729b61d22adfbbd6335528f2aedc16817364a02b15189ab45b2ecbfd094f898db06e3ab0c950f21664662661eb8c06f197b95412d6a7f6172858a66d823943a"

RPROVIDES:${PN} += "python3-setproctitle \
python3.10dist(setproctitle) \
python310-setproctitle \
python310-setproctitle(aarch-64) \
python3dist(setproctitle)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
