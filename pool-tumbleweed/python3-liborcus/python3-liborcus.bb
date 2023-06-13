SUMMARY = "Python bindings for liborcus"
DESCRIPTION = "Python 3 bindings for liborcus."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "python3-liborcus-0.17.2-3.4.aarch64.rpm"
RPM_HASH = "431ab00a30a3612599de93e2b2bf7fe1d07fc1d99f8cef865c5e7ad02de6b33719e5c2215796da10dd987857e1ae9dd25dcff32423e7c405701b4a1396fd557e"

RPROVIDES:${PN} += "liborcus-python3 \
python3-liborcus \
python3-liborcus(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libixion-0.17.so.0()(64bit) \
liborcus-0.17.so.0()(64bit) \
liborcus-parser-0.17.so.0()(64bit) \
liborcus-spreadsheet-model-0.17.so.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
