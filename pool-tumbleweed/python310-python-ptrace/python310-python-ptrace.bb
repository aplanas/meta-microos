SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "python310-python-ptrace-0.9.7-1.14.aarch64.rpm"
RPM_HASH = "95ad6ffb4e01c87bbecaa9107742bc94529115bf9bf7c6015c305100388b09b1efe33dcf97147534cdb762ee7de198a92682acd79803f8d72695df2dd7bacd43"

RPROVIDES:${PN} += "python3-python-ptrace \
python3.10dist(cptrace) \
python3.10dist(python-ptrace) \
python310-python-ptrace \
python310-python-ptrace(aarch-64) \
python3dist(cptrace) \
python3dist(python-ptrace)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
