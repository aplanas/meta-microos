SUMMARY = "Extensible JSON encoder/decoder for Python"
DESCRIPTION = "simplejson is an extensible JSON encoder and decoder for Python 2.5+. It is \
pure Python code with no dependencies, but includes an optional C extension for \
a speed boost."
LICENSE = "AFL-2.1 | MIT"

PV = "3.19.1"

RPM_NAME = "python310-simplejson-3.19.1-1.1.aarch64.rpm"
RPM_HASH = "a2644d8863a0fa397a4953c97ffc659aba038323f0be65e6001717374a04241f0451b6ade9dbb2185103b60f728dff9f26df772132b8d1e27e7ff5d905bcb438"

RPROVIDES:${PN} += "python3-simplejson \
python3.10dist-simplejson \
python310-simplejson \
python3dist-simplejson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
