SUMMARY = "Extensible JSON encoder/decoder for Python"
DESCRIPTION = "simplejson is an extensible JSON encoder and decoder for Python 2.5+. It is \
pure Python code with no dependencies, but includes an optional C extension for \
a speed boost."
LICENSE = "AFL-2.1 | MIT"

PV = "3.19.1"

RPM_NAME = "python311-simplejson-3.19.1-1.3.aarch64.rpm"
RPM_HASH = "f32fb147b91d6469030735fbcd6393f6687d7e28418fb5a1f6ec2d0317dee0119446e0b3e196c4b9b593433f2ff68452ae793c6d3e8227a19f6763e2c335da02"

RPROVIDES:${PN} += "python3-simplejson \
python3.11dist-simplejson \
python311-simplejson \
python3dist-simplejson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
