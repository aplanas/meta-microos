SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python39-pyheif-0.7.1-2.3.aarch64.rpm"
RPM_HASH = "afb76af08c5957d32e72dc387cb963b1ad2db390537bcc9738aaed9dc4215e5e4c04448d4832c589faab252db7305d19b0284e4bb12913d537dbc2dc36728ef4"

RPROVIDES:${PN} += "python3.9dist-pyheif \
python39-pyheif \
python3dist-pyheif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libheif.so.1 \
python-abi \
python39-cffi"

inherit rpm
