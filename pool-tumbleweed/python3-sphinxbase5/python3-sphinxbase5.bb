SUMMARY = "Python bindings for sphinxbase required by python-pocketsphinx"
DESCRIPTION = "Python3 bindings for sphinxbase5-5~git20220609.617e536 \
 \
CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "5~git20220609.617e536"

RPM_NAME = "python3-sphinxbase5-5~git20220609.617e536-1.5.aarch64.rpm"
RPM_HASH = "c2162dba3838e73bb3eed79777acb3b38587b3101ec198f0284cd2ea8aa20329387e4caf9d8fc167278cb2ffb1a428048d3d588b6c3c97a39223bd05ca042f61"

RPROVIDES:${PN} += "python3-sphinxbase5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsphinxbase.so.3 \
python-abi \
sphinxbase5"

inherit rpm
