SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, rust-cpython and cffi bindings \
as well as rust binaries as python packages. \
 \
This project is a zero-configuration replacement for \
setuptools-rust milksnake. It supports building wheels for Python \
3.6+, can upload them to PyPI and has basic PyPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.1"

RPM_NAME = "python311-maturin-1.0.1-1.1.aarch64.rpm"
RPM_HASH = "9e0a7b9c535e80cb74369b62d57a464e42140ce400d3b5b020dfc911586e6ca6b171f97387ef8404df11296b42a0a00c372ee0d41df7ddd19c76a0feabacc315"

RPROVIDES:${PN} += "python3.11dist-maturin \
python311-maturin \
python3dist-maturin"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
update-alternatives"

inherit rpm
