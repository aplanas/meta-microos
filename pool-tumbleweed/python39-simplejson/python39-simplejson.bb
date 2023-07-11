SUMMARY = "Extensible JSON encoder/decoder for Python"
DESCRIPTION = "simplejson is an extensible JSON encoder and decoder for Python 2.5+. It is \
pure Python code with no dependencies, but includes an optional C extension for \
a speed boost."
LICENSE = "AFL-2.1 | MIT"

PV = "3.19.1"

RPM_NAME = "python39-simplejson-3.19.1-1.3.aarch64.rpm"
RPM_HASH = "89bebaa49d020e764ca13b3db2f95469377f3251b2d66991339160ecccfa8967d9962e7e526b94cfb23c4b69dad82cd979f8578b58ed8afe2f80c3253d2234eb"

RPROVIDES:${PN} += "python3.9dist-simplejson \
python39-simplejson \
python3dist-simplejson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
