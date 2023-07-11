SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2022.10.27"

RPM_NAME = "python310-cmarkgfm-2022.10.27-2.3.aarch64.rpm"
RPM_HASH = "590c22320f89cc2fc456a42d3478ee9b91ad103c725d1b946ae417064aee1f375740f79288f9db5fafbc468214b66c41819569adcdbcde6773d523ed67385888"

RPROVIDES:${PN} += "python3.10dist-cmarkgfm \
python310-cmarkgfm \
python3dist-cmarkgfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi"

inherit rpm
