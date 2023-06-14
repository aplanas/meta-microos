SUMMARY = "Python bindings for sphinxbase required by python-pocketsphinx"
DESCRIPTION = "Python3 bindings for sphinxbase5-5~git20220609.617e536 \
 \
CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "5~git20220609.617e536"

RPM_NAME = "python3-sphinxbase5-5~git20220609.617e536-1.4.aarch64.rpm"
RPM_HASH = "fbff93e259423856b7474d0869f6e4534d095e19a81253c88fdde54e7313fdec4f332e10695d2920a972fdd41c53857295dbdab4685576733d531a1e544f685d"

RPROVIDES:${PN} += "python3-sphinxbase5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsphinxbase.so.3 \
python-abi \
sphinxbase5"

inherit rpm
