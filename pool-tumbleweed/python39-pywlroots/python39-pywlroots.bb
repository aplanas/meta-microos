SUMMARY = "Python binding to the wlroots library using cffi"
DESCRIPTION = "Python binding to the wlroots library using cffi."
LICENSE = "NCSA"

PV = "0.16.4"

RPM_NAME = "python39-pywlroots-0.16.4-1.2.aarch64.rpm"
RPM_HASH = "4ef802c168068f34d61dffe9820ce9cdfa58e24d04ae973484866fab5a450741b97d72c36193417614be428da15f43a1c17e4ef8f45fef1be9df8f0c1ae6eda6"

RPROVIDES:${PN} += "python3.9dist-pywlroots \
python39-pywlroots \
python3dist-pywlroots"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwlroots.so.11 \
python-abi \
python39-pywayland \
python39-xkbcommon"

inherit rpm
