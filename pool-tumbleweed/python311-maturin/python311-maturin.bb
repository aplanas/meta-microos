SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, rust-cpython and cffi bindings \
as well as rust binaries as python packages. \
 \
This project is a zero-configuration replacement for \
setuptools-rust milksnake. It supports building wheels for Python \
3.6+, can upload them to PyPI and has basic PyPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.0"

RPM_NAME = "python311-maturin-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "f0e29df28cb8435f827ff4b6b35f87426a2e67f5919b0b1ec4d3558905e435092d1e9ffd3d405eb8b6210d516aad74e8f01073795a8bcf2a915e307c064e9eab"

RPROVIDES:${PN} += "python3-maturin \
python3.11dist-maturin \
python311-maturin \
python3dist-maturin"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
update-alternatives"

inherit rpm
